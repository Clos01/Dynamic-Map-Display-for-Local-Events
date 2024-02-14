document.getElementById('searchForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting via the browser's default action

    const cityName = document.getElementById('cityName').value;
    const radius = parseFloat(document.getElementById('radius').value);
    const keyword = document.getElementById('keyword').value;

    fetchCoordinatesForCity(cityName)
        .then(coordinates => fetchNearbyRestaurants(coordinates, radius, keyword))
        .then(displayResults)
        .catch(error => console.error('Error:', error));
});

function fetchCoordinatesForCity(cityName) {
    return fetch(`https://maps.googleapis.com/maps/api/geocode/json?address=${encodeURIComponent(cityName)}`)
        .then(response => response.json())
        .then(data => {
            if (data.status === "OK") {
                return data.results[0].geometry.location; // { lat, lng }
            } else {
                throw new Error('Geocoding failed');
            }
        });
}

function fetchNearbyRestaurants(coordinates, radius, keyword) {
    const radiusInMeters = Math.round(radius * 1609.34);
    const requestUrl = `/api/places/nearbyRestaurants?location=${coordinates.lat},${coordinates.lng}&radius=${radiusInMeters}&keyword=${encodeURIComponent(keyword)}`;

    return fetch(requestUrl).then(response => response.json());
}

function displayResults(data) {
    const resultsList = document.getElementById('resultsList');
    resultsList.innerHTML = ''; // Clear previous results

    if (data.results && data.results.length > 0) {
        data.results.forEach(place => {
            const listItem = document.createElement('li');
            listItem.innerHTML = `<strong>${place.name}</strong> - Latitude: ${place.geometry.location.lat}, Longitude: ${place.geometry.location.lng}`;
            resultsList.appendChild(listItem);
        });
    } else {
        resultsList.innerHTML = '<li>No results found</li>';
    }
}

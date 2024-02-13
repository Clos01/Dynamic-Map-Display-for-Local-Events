// Assume you have an empty <ul id="placesList"></ul> in your search.html

document.getElementById('searchForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission from reloading the page

    const location = document.getElementById('location').value;
    const radiusInMeters = document.getElementById('radiusInMeters').value;
    const keyword = document.getElementById('keyword').value;
    const url = `/api/places/nearbyRestaurants?location=${location}&radiusInMeters=${radiusInMeters}&keyword=${keyword}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const placesList = document.getElementById('placesList');
            placesList.innerHTML = ''; // Clear previous results
            data.results.forEach(place => {
                const listItem = document.createElement('li');
                listItem.textContent = place.name; // Assuming 'name' is part of your DTO and returned JSON
                placesList.appendChild(listItem);
            });
        })
        .catch(error => console.error('Error fetching places:', error));
});

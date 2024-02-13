fetch('/api/places/nearbyRestaurants?location=35.7796,-78.6382&radiusInMeters=3218&keyword=mexican')
  .then(response => response.json())
  .then(data => {
    console.log(data); // Now 'data' is a JavaScript object
    displayData(data); // Function to handle the display of this data
  })
  .catch(error => console.error('Error fetching data: ', error));
  function displayData(data) {
    const resultsContainer = document.getElementById('results'); // Assume you have a div with this id in your HTML
    resultsContainer.innerHTML = ''; // Clear previous results
    
    data.results.forEach(place => {
      const placeElement = document.createElement('div');
      placeElement.textContent = place.name; // Add other details you want to display
      resultsContainer.appendChild(placeElement);
    });
  }
  
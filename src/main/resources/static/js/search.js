function initialize() {
    google.maps.event.addDomListener(window, 'load', initialize);
    var input = document.getElementById('autocomplete_search');
    var autocomplete = new google.maps.places.Autocomplete(input);
    autocomplete.addListener('place_changed', function() {
      var place = autocomplete.getPlace();
      document.getElementById('lat').value = place.geometry.location.lat();
      document.getElementById('long').value = place.geometry.location.lng();
    });
  }

  
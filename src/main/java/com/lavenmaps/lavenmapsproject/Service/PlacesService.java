package com.lavenmaps.lavenmapsproject.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class PlacesService {

       @Autowired
  private  RestTemplate restTemplate;

 @Value("${api.key}")
 private String apiKey;


public PlacesService(RestTemplate restTemplate) {
  this.restTemplate = restTemplate;
}
  //had to use Optional here because may or may not contain the value in here so you have to prepared to handle that situation if this is not here can return null pointer 
public  Optional<String> getNearbyRestaurants (String location, int radius) {
  String thisUrl = String.format(
      "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=%s&radius=%d&type=restaurant&key=%s",
      location, radius, apiKey);
      String response = restTemplate.getForObject(thisUrl, String.class);
  return Optional.ofNullable(response);
}


}

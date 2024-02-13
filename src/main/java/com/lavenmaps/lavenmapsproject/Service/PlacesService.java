package com.lavenmaps.lavenmapsproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lavenmaps.lavenmapsproject.dto.PlacesSearchResponse;

import java.util.Optional;

@Service
public class PlacesService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${api.key}")
  private String apiKey;
  // Fetch nearby restaurants and return them as a DTO
    public Optional<PlacesSearchResponse> getNearbyRestaurants(String location, int radiusInMeters, String keyword) {
        String url = String.format(
                "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=%s&radius=%d&type=restaurant&keyword=%s&key=%s",
                location, radiusInMeters, keyword, apiKey);
        
        // Fetch data from the API
        PlacesSearchResponse response = restTemplate.getForObject(url, PlacesSearchResponse.class);
        
        // Wrap the response in an Optional and return
        return Optional.ofNullable(response);
    }
}

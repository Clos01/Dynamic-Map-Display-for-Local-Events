package com.lavenmaps.lavenmapsproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lavenmaps.lavenmapsproject.Util.JsonFormatter;

import java.util.Optional;

@Service
public class PlacesService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    public Optional<String> getNearbyRestaurants(String location, int radiusInMeters, String keyword) {
        String url = String.format(
                "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=%s&radius=%d&type=restaurant&keyword=%s&key=%s",
                location, radiusInMeters, keyword, apiKey);
        @SuppressWarnings("null")
        String response = restTemplate.getForObject(url, String.class);
        return Optional.ofNullable(response);
    }

    public void processApiResponse(String jsonResponse) {
        // Assuming jsonResponse is a JSON string you received from the API
        String formattedJson = JsonFormatter.format(jsonResponse);
        System.out.println(formattedJson);
    }
}

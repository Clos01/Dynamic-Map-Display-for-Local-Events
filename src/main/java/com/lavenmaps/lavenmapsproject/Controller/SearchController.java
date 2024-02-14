package com.lavenmaps.lavenmapsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lavenmaps.lavenmapsproject.Service.PlacesService;
import com.lavenmaps.lavenmapsproject.dto.PlacesSearchResponse;

import java.util.Optional;
@RestController
@RequestMapping("/api/places")
public class SearchController {

    private final PlacesService placesService;

    public SearchController(PlacesService placesService) {
        this.placesService = placesService;
    }

    @GetMapping("/nearbyRestaurants")
    public Optional<PlacesSearchResponse> getNearbyRestaurants(
            @RequestParam String location, 
            @RequestParam int radius, 
            @RequestParam String keyword) {
        return placesService.getNearbyRestaurants(location, radius, keyword);
    }
}

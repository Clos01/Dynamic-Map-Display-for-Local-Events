package com.lavenmaps.lavenmapsproject.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lavenmaps.lavenmapsproject.Service.PlacesService;

@RestController //Controller + ResponseBody 
@RequestMapping("/api/places")
public class SearchController {

         private final PlacesService placesService;
        
         public SearchController(PlacesService placesService) {
            this.placesService = placesService;
        }
 
        @GetMapping("/nearbyRestaurants")
        public Optional<String> getNearbyRestaurants(@RequestParam String location, @RequestParam int radius) {
            return placesService.getNearbyRestaurants(location, radius);
}
}
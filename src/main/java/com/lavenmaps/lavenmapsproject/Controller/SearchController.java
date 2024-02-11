package com.lavenmaps.lavenmapsproject.controller;

import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.lavenmaps.lavenmapsproject.Model.Restaurant;
import com.lavenmaps.lavenmapsproject.Repository.RestaurantRepository;
import com.lavenmaps.lavenmapsproject.Service.RestaurantService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController //Controller + ResponseBody 
@RequestMapping("/api/restaurants")
public class SearchController {

        @Autowired
        private RestaurantService restaurantService;
        
 @GetMapping("/search")
    public ResponseEntity<List<Restaurant>> searchRestaurants(@RequestParam String name) {
        List<Restaurant> restaurants = restaurantService.searchByName(name);
        return ResponseEntity.ok(restaurants);
    }
}

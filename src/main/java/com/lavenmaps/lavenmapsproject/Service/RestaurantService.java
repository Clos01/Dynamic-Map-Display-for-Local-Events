package com.lavenmaps.lavenmapsproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavenmaps.lavenmapsproject.Model.Restaurant;
import com.lavenmaps.lavenmapsproject.Repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllUsers() {
        return restaurantRepository.findAll();
    
}

public Optional<Restaurant> getUserById(Long id) {
    return restaurantRepository.findById(id);
}

public Restaurant createUser(Restaurant restaurant) {
    return restaurantRepository.save(restaurant);
}

}

// package com.lavenmaps.lavenmapsproject.Service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.lavenmaps.lavenmapsproject.Model.Restaurant;
// import com.lavenmaps.lavenmapsproject.Repository.RestaurantRepository;

// @Service // service layer of an application
// public class RestaurantService {

//     @Autowired // automatic dependency injection satisfy bean dependencies by searching the
//                // application context for matching beans.
//     private RestaurantRepository restaurantRepository;

//     public RestaurantService(RestaurantRepository restaurantRepository) {
//         this.restaurantRepository = restaurantRepository;
//     }

//     // restaurant model class below
//     public List<Restaurant> getAllUsers() {
//         return restaurantRepository.findAll();

//     }

//     public Optional<Restaurant> getUserById(Long id) {
//         return restaurantRepository.findById(id);
//     }

//     public Restaurant createUser(Restaurant restaurant) {
//         return restaurantRepository.save(restaurant);
//     }

//     public List<Restaurant> searchByName(String name) {
//         return restaurantRepository.findByNameContainingIgnoreCase(name);
//     }

// }

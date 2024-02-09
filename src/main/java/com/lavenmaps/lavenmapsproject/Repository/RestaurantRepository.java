package com.lavenmaps.lavenmapsproject.Repository;

import com.lavenmaps.lavenmapsproject.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

//imports JpaRepository class automatically creates CRUD 
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
}

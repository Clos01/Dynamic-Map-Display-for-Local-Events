package com.lavenmaps.lavenmapsproject.Repository;

import com.lavenmaps.lavenmapsproject.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
}

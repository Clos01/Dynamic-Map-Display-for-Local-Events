package com.lavenmaps.lavenmapsproject.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    //Attributes 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String name;
    private String location; 

//constructor 
public Restaurant() {

}

// getters and setters



}

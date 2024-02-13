// package com.lavenmaps.lavenmapsproject.Model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
// public class Restaurant {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String name;
//     private String location;
//     private String description; // New field for description
//     private Double rating; // Example of adding a rating
//     private String placeId; // To store the Google Places API place ID

//     // No-argument constructor
//     public Restaurant() {
//     }

//     // All-arguments constructor
//     public Restaurant(String name, String location, String description, Double rating, String placeId) {
//         this.name = name;
//         this.location = location;
//         this.description = description;
//         this.rating = rating;
//         this.placeId = placeId;
//     }

//     // Getters and setters for all fields

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }

//     public String getLocation() { return location; }
//     public void setLocation(String location) { this.location = location; }

//     public String getDescription() { return description; }
//     public void setDescription(String description) { this.description = description; }

//     public Double getRating() { return rating; }
//     public void setRating(Double rating) { this.rating = rating; }

//     public String getPlaceId() { return placeId; }
//     public void setPlaceId(String placeId) { this.placeId = placeId; }
// }

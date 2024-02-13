package com.lavenmaps.lavenmapsproject.dto;

public class PlaceResult {
    private String name;
    private Geometry geometry;
    // Add other fields as necessary

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
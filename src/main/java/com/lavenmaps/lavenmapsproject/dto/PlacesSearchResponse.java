package com.lavenmaps.lavenmapsproject.dto;

import java.util.List;

public class PlacesSearchResponse {
    private List<PlaceResult> results;

    // Getters and setters
    public List<PlaceResult> getResults() {
        return results;
    }

    public void setResults(List<PlaceResult> results) {
        this.results = results;
    }
}


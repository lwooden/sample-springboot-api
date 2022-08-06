package com.sample_springboot_api.sample_springboot_api.models;

public class EnvironmentCheckResponse {
   
    private String classification;
    private String location;
    

    public EnvironmentCheckResponse(String classification) {
        this.classification = classification;
    }

    
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

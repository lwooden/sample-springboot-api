package com.sample_springboot_api.sample_springboot_api.models;

public class CustomResponse {
    private String message;

    public CustomResponse(String message) {
        this.message = message;
    }
    

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}

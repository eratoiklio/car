package com.ada.car.user.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ada.car.user.entity.User;

public class UserRequest {
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public User getUser(){
        User user = new User();
        user.setEmail(this.email);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        return user;
    }
}

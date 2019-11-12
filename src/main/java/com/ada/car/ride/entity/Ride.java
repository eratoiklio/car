package com.ada.car.ride.entity;

import com.ada.car.user.entity.User;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Ride {
    public Long getId() {
        return id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<User> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<User> passengers) {
        this.passengers = passengers;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startPoint;
    private String endPoint;
    @ManyToOne
    @JoinColumn(name="fk_owner")
    private User owner;
    @ManyToMany(mappedBy = "assignedRides")
    private List<User> passengers;
}

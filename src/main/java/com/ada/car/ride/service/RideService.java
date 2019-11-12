package com.ada.car.ride.service;

import com.ada.car.ride.entity.Ride;
import com.ada.car.ride.repository.RideRepository;
import com.ada.car.ride.request.RideRequest;
import com.ada.car.user.repository.UserRepository;
import com.ada.car.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    RideRepository rideRepository;
    private UserService userService;
    public RideService(RideRepository rideRepository, UserService userService){
        this.rideRepository = rideRepository;
        this.userService = userService;
    }
    public Ride saveRide(RideRequest request){
        Ride ride = new Ride();
        ride.setEndPoint(request.getEndPoint());
        ride.setStartPoint(request.getStartPoint());
        ride.setOwner(userService.getUserByEmail(request.getEmail()));
        return this.rideRepository.saveAndFlush(ride);
    }
}

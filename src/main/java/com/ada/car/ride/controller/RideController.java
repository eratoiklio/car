package com.ada.car.ride.controller;

import com.ada.car.ride.entity.Ride;
import com.ada.car.ride.repository.RideRepository;
import com.ada.car.ride.request.RideRequest;
import com.ada.car.ride.service.RideService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="ride")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Long saveRide(@RequestBody RideRequest rideRequest){
        Ride ride = rideService.saveRide(rideRequest);
        return ride.getId();
    }
}

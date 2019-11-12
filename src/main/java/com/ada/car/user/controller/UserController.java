package com.ada.car.user.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ada.car.user.entity.User;
import com.ada.car.user.request.UserRequest;
import com.ada.car.user.service.UserService;

@RestController
@RequestMapping(value= "user")
public class UserController {
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @RequestMapping(method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long saveUser(
    @RequestBody UserRequest userRequest){
         User user =   this.userService.saveUser(userRequest.getUser());
          return  user.getId();
    }
}

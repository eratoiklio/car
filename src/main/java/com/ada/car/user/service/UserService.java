package com.ada.car.user.service;

import org.springframework.stereotype.Service;
import com.ada.car.user.entity.User;
import com.ada.car.user.repository.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User getUserByEmail(String email) {
        return  userRepository.findUserByEmail(email);
    }
}

package com.ada.car.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ada.car.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}

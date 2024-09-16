package com.bansikah.pharmacy_backend.service;

import com.bansikah.pharmacy_backend.domain.User;
import com.bansikah.pharmacy_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    // Add other service methods if needed
}
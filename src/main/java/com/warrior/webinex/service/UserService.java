package com.warrior.webinex.service;

import com.warrior.webinex.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warrior.webinex.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register New User in DB
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Fetch All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Find User By ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Find User By Email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Update User Details
    public User updateUser(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // Delete User by userID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

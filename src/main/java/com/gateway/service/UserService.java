package com.gateway.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.entity.User;
import com.gateway.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ================= GET ALL USERS =================

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    // ================= GET USER BY ID =================

    public User getUserById(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    // ================= SAVE USER =================

    public User saveUser(User user) {

        return userRepository.save(user);
    }

    // ================= UPDATE USER =================

    public User updateUser(Long id, User updatedUser) {

        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {

            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setRole(updatedUser.getRole());

            return userRepository.save(existingUser);
        }

        return null;
    }

    // ================= DELETE USER =================

    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }
}

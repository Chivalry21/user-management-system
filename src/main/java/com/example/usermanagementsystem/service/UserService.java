package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.dto.CreateUserRequest;
import com.example.usermanagementsystem.dto.UpdateUserRequest;
import com.example.usermanagementsystem.dto.UserResponse;

import java.util.List;

public interface UserService {
        UserResponse createUser(CreateUserRequest request);
        UserResponse getUserById(Long id);
        UserResponse updateUser(Long id, UpdateUserRequest request);
        void deleteUser(Long id);
        List<UserResponse> getAllUsers();
}



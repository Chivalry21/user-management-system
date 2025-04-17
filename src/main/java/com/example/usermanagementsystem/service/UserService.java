package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.dto.CreateUserRequest;
import com.example.usermanagementsystem.dto.UpdateUserRequest;
import com.example.usermanagementsystem.dto.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
        UserResponse createUser(CreateUserRequest request);
        UserResponse getUserById(Long id);
        UserResponse updateUser(Long id, UpdateUserRequest request);
        void deleteUser(Long id);
        List<UserResponse> getAllUsers();
}



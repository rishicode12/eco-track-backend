package com.ecotrack.backend.service;

import com.ecotrack.backend.dto.LoginRequest; // Naya import add kiya
import com.ecotrack.backend.dto.UserRegistrationRequest;
import com.ecotrack.backend.entity.User;

public interface UserService {

    // Naya user register karne ke liye
    User registerUser(UserRegistrationRequest request);

    // User ko login karne ke liye (Yeh nayi line add hui hai)
    User loginUser(LoginRequest request);

}
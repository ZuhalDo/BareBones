package com.example.BareBones.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.BareBones.model.User;
import com.example.BareBones.Repo.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}
package com.personalfinance.controller;

import com.personalfinance.entity.User;
import com.personalfinance.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @GetMapping

    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
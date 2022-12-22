package com.alammar.spring6.controller;

import com.alammar.spring6.model.UserProfile;
import com.alammar.spring6.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/userprofile")
public class UserProfileController {
    private final UserProfileService userService;

    @Autowired
    public UserProfileController(UserProfileService userService) {
        this.userService = userService;
    }

    @GetMapping(produces = "application/json")
    public List<UserProfile> getAllUsers() {
        return userService.findAllUsers();
    }
}

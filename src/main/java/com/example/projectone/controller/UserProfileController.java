package com.example.projectone.controller;

import com.example.projectone.model.UserInfo;
import com.example.projectone.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/profiles")
public class UserProfileController {

    private final UserService userService;
    public UserProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserInfo> getProfiles(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserInfo> getUserById(@PathVariable(name = "id") Long id ){
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.ACCEPTED);
    }
}

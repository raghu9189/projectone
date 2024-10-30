package com.example.projectone.service;

import com.example.projectone.model.UserInfo;
import com.example.projectone.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserInfo> getAllUsers(){
        return userRepo.findAll();
    }

    public UserInfo getUser(Long id){
        return userRepo.findById(id).orElse(null);
    }
}

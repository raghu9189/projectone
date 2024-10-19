package com.example.projectone.controller;

import com.example.projectone.model.State;
import com.example.projectone.repository.StateRepo;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/states")
public class StateController {

    private final StateRepo stateRepo;

    @Autowired
    public StateController(StateRepo stateRepo){
        this.stateRepo = stateRepo;
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> getStateById(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(stateRepo.findById(id).orElse(null), HttpStatus.OK);
    }
}

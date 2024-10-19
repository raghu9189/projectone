package com.example.projectone.controller;

import com.example.projectone.model.City;
import com.example.projectone.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cities")
public class CityController {
    private final CityRepo cityRepo;

    @Autowired
    public CityController(CityRepo cityRepo){
        this.cityRepo = cityRepo;
    }

    @GetMapping
    public ResponseEntity<List<City>> getAllCites(){
        return new ResponseEntity<>(cityRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity<>(cityRepo.findById(id).orElse(null), HttpStatus.OK);
    }

}

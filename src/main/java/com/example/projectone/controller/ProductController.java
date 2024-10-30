package com.example.projectone.controller;

import com.example.projectone.model.Product;
import com.example.projectone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    private String greetMessage;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/hello")
    public String greet(){
        return "hello world";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}

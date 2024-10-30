package com.example.projectone.service;

import com.example.projectone.model.Author;
import com.example.projectone.repository.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public List<Author> getAllAuthors(){
        return authorRepo.findAll();
    }
}

package com.example.projectone.service;

import com.example.projectone.model.Book;
import com.example.projectone.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }
}

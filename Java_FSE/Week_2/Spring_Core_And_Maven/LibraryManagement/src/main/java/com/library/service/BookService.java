package com.library.service;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository repository;

    public BookService() {
    }

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setBookRepository(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }
}
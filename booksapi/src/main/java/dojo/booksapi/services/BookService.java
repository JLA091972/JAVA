package dojo.booksapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.booksapi.repositories.BookRepository;

@Service
public class BookService {

    @Autowired BookRepository bookRepository;
    
}

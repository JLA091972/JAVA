package dojo.bookclub.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.bookclub.models.Book;
import dojo.bookclub.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getOneItem(Long id) {
        Optional<Book> onebook = bookRepository.findById(id);
        Book book = onebook.orElse(null);
        return book;
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteItem(Book book) {
        bookRepository.delete(book);
    }

    
}

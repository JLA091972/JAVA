package dojo.booksapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dojo.booksapi.models.Book;
import dojo.booksapi.repositories.BookRepository;

@Controller
public class MainController {

    @Autowired BookRepository bookRepository;

    //! Create

    


    //! READ ALL
    @GetMapping("/")
    public String index(Model model){
        List<Book> books = bookRepository.findAll();
        System.out.println(books);
        model.addAttribute("books", books);
        return "index.jsp"; //view
    }


    //! READ ONE
    @GetMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model){
        Optional<Book> optionalbook = bookRepository.findById(id);
        Book book = optionalbook.orElse(null);
        System.out.println(book);
        model.addAttribute("book", book);
        return "show.jsp";
    }



    //! UPDATE



    //! DELETE

}
    
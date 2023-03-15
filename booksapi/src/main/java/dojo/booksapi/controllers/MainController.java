package dojo.booksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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



    //! UPDATE



    //! DELETE

}
    
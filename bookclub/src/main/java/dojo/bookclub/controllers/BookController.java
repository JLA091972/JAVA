package dojo.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import dojo.bookclub.models.Book;
import dojo.bookclub.services.BookService;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    // Create/Add a book
    @GetMapping("/books/new")
    public String createBook(@ModelAttribute("book") Book book, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "books/newbook.jsp";
    }

    @PostMapping("/addbook") // should be the same on the form action!!
    public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult results, Model model) {
        if (results.hasErrors()) {
            return "books/newbook.jsp";
        } else {
            bookService.addBook(book);
            return "redirect:/books";
        }
    }

    // Read ALL
    @GetMapping("/books")
    public String books(Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books/books.jsp";
    }

    // Read One
    @GetMapping("/books/{id}")
    public String showOne(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        Book book = bookService.getOneItem(id);
        model.addAttribute("book", book);
        return "books/showabook.jsp";
    }

    // Update
    @GetMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        Book book = bookService.getOneItem(id);
        model.addAttribute("book", book);
        System.out.println(book);
        return "books/edit.jsp";
    }

    @PutMapping("/books/{id}/update")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book,  BindingResult results) {
        System.out.println(book);
        if (results.hasErrors()) {
            return "books/edit.jsp";
        } else {
            System.out.println(book);
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }

    // Delete
    @DeleteMapping("/books/{id}")
    public String remove(@PathVariable("id") Long id) {
        Book book = bookService.getOneItem(id);
        bookService.deleteItem(book);
        return "redirect:/books";
    }

}

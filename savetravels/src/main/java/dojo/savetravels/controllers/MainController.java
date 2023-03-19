package dojo.savetravels.controllers;

import java.util.List;

import javax.print.DocFlavor.READER;
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

import dojo.savetravels.models.Travel;
import dojo.savetravels.services.TravelService;


@Controller
public class MainController {
    // class definition and imports here...
    @Autowired TravelService travelService;

    //!Create
    //render the form
    @GetMapping("/")
    // item came from ModelAttribute in index.jsp.. Trave = from models, item is the variable
    public String index(@ModelAttribute("item") Travel item, Model model) {
        List<Travel> items = travelService.getAllItems();   //read all
        // System.out.println(items);
        model.addAttribute("items", items);   //this will populate information on table
        return "index.jsp";
    }
    
    //handle the form data
    @PostMapping("/expenses")
    public String createExpense(@Valid @ModelAttribute("item") Travel item, BindingResult results) {
        if (results.hasErrors()) {
            return "index.jsp";
        } else {
            travelService.createExpense(item);
            return "redirect:/";
        }
        
    }

    //Read One
    @GetMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Travel expense = travelService.getOneItem(id);
        model.addAttribute("expense", expense);
        return "show.jsp";
    }

    //UPDATE
    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Travel expenses = travelService.getOneItem(id);
        model.addAttribute("item", expenses);
        System.out.println(expenses);
        return "expenses/edit.jsp";
    }

    // @PutMapping("/expenses/{id}")
    // public String update(@ModelAttribute("item") Travel item) {
    //     System.out.println(item);
    //     travelService.updateExpense(item);
    //     return "redirect:/";
    // }


    //Delete
    @DeleteMapping("/expenses/{id}")
    public String remove(@PathVariable("id") Long id) {
        Travel item = travelService.getOneItem(id);
        travelService.deleteItem(item);
        return "redirect:/";

    }


}





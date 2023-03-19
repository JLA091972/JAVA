package dojo.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dojo.savetravels.models.Travel;
import dojo.savetravels.services.TravelService;


@Controller
public class MainController {
    // class definition and imports here...
    @Autowired
    TravelService travelService;

    //!Create
    //render the form
    @GetMapping("/")
    // item came from ModelAttribute in index.jsp.. Trave = from models, item is the variable
    public String index(@ModelAttribute("item") Travel item, Model model) {
        List<Travel> items = travelService.getAllItems();
        // System.out.println(items);
        model.addAttribute("items", items);   //table populated
        return "index.jsp";
    }
    
    //handle the form data
    @PostMapping("/expenses")
    public String createExpense(@ModelAttribute("item") Travel item) {
        travelService.createExpense(item);
        return "redirect:/";
    }






}





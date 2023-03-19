package dojo.dojosninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dojo.dojosninjas.models.Dojo;
import dojo.dojosninjas.services.DojoService;

@Controller
public class MainController {
    // class definition and imports here...

    // make connection to SERVICE
    // Autowired should point to XxxxxService xxxxxService
    @Autowired
    DojoService dojoService;

//Create
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojos/create.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
        dojoService.createDojo(dojo);
        return"redirect:/";
    }
    





}
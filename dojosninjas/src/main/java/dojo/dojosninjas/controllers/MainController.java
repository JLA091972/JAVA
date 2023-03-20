package dojo.dojosninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dojo.dojosninjas.models.Dojo;
import dojo.dojosninjas.models.Ninja;
import dojo.dojosninjas.services.DojoService;
import dojo.dojosninjas.services.NinjaService;

@Controller
public class MainController {
    // class definition and imports here...

    // make connection to SERVICE
    // Autowired should point to XxxxxService xxxxxService
    @Autowired
    DojoService dojoService;
    @Autowired
    NinjaService ninjaService;

//Create  for Dojo
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojos/create.jsp";
    }

    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo") Dojo dojo) { 
        dojoService.createDojo(dojo);
        return"redirect:/";
    }
    
// Create for Ninjas
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "ninjas/create.jsp";
    }

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
        ninjaService.createNinja(ninja);
        return "redirect:/";
    }


    //show all Dojos
    @GetMapping("/dojos/all")
    public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
        List<Dojo> dojos = dojoService.getAllDojos();
        System.out.println(dojos);

        model.addAttribute("dojos", dojos); // this will populate information on table
        return "dojos/showalldojo.jsp";
    }

    //Show Ninjas on a Dojo (show one)
    @GetMapping("/dojo/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.getOneDojo(id);
        System.out.println(dojo);
        model.addAttribute("dojo", dojo);
        return "dojos/showninjasindojo.jsp";
    }


}
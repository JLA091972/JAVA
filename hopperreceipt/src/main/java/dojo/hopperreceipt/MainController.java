package dojo.hopperreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    // class definition and imports here...
    @GetMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";

        model.addAttribute("name", name);  //puts name string to the object "name" so it can be accessed to index.jsp
        model.addAttribute("itemName", itemName);  
        model.addAttribute("price", price);  
        model.addAttribute("description", description);  
        model.addAttribute("vendor", vendor);  
    
    	// Your code here! Add values to the view model to be rendered
    
        return "index.jsp";
    }
    
}

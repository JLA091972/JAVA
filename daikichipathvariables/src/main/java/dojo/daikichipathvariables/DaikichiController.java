package dojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    @RequestMapping("")
    public String index() {
        return "Welcome";
    }

    @RequestMapping("/travel/{pathvar}")
    public String travel(@PathVariable("pathvar") String pathvar) {
        return String.format("Congratulations! You will soon travel to %s!!", pathvar);
    }

    @RequestMapping("/lotto/{pathvar}")
    public String lotto(@PathVariable("pathvar") int pathvar) {
        // int var = Integer.parseInt(pathvar);
        if (pathvar % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }

    }

}

package dojo.daikichiroute;

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

    @RequestMapping("/{pathvar}")
    public String today(@PathVariable("pathvar") String pathvar) {
        if (pathvar.equals("today")) {
            return "Today you will find luck in all your endeavors!";
        }

        if (pathvar.equals("tomorrow")) {
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
        return "I dont know";
    }
}

package dojo.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    @PostMapping("/omikuji") // handles data... name should be the same as the index.jsp form
    public String handledata(
            @RequestParam(value = "number") Integer number,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "person") String person,
            @RequestParam(value = "hobby") String hobby,
            @RequestParam(value = "livingthing") String livingthing,
            @RequestParam(value = "comment") String comment,

            HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingthing", livingthing);
        session.setAttribute("comment", comment);

        // System.out.printf("%d %s %s %s %s %s ", number, city, person, hobby, livingthing, comment);
        return "redirect:/show";
    }

    @RequestMapping(value = "/show")
    public String displayData() {
        return "show.jsp";
    }

}

package ru.gothmog.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gothmog.bookstore.model.Message;

/**
 * @author d.grushetskiy
 */
@Controller
public class AppController {

    @Value("Jack Vorobey")
    private final Message message;

    @Autowired
    public AppController(Message message) {
        this.message = message;
    }

    // http://localhost:8080/
    @RequestMapping("/")
    public String helloPage(Model model){
        model.addAttribute("name", message.getName());
        return "hello";
    }
}

package de.hsk.springbootvuejs.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        return "HELLO_TEXT";
    }
}

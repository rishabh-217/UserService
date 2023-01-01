package com.test.UserService.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return  "You are on home page.";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "You are on Dashboard Page";
    }

}

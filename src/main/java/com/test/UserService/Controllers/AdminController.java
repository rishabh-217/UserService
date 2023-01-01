package com.test.UserService.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/home")
    public  String adminHome(){
        return "Admin Home";
    }

    @GetMapping("/dashboard")
    public String adminDashboard(){
        return "Admin Dashboard";
    }

}

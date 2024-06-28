package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/addUser")
    public String addUser() {
        System.out.println("UserController::addUser()");
        return "home.jsp";
    }
}

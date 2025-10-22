package com.Banking.bank_management.controller;

import com.Banking.bank_management.dto.User;
import com.Banking.bank_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String log(){
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute User user){
        if(userService.signin(user)){
            return "Account";
        }else{
            return "login";
        }
    }

    @PostMapping("/register/{user}/{pass}")
    public String reg(@PathVariable String user,@PathVariable String pass){
        userService.save(new User(user,pass));
        return "thank";
    }

}

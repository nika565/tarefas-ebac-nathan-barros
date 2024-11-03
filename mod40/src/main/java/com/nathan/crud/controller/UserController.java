package com.nathan.crud.controller;

import com.nathan.crud.model.User;
import com.nathan.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/new")
    public String registerUsers(Model model){
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user){
        userService.saveUser(user);
        return "redirect:/users/list";
    }

    @GetMapping("/list")
    public String listUsers(Model model){
        List<User> list = userService.findAllUsers();
        model.addAttribute("users", list);
        return "users/list";
    }

}

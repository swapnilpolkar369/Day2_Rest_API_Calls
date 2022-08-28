package com.example.newhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebController {

    @GetMapping(value = {"","/","/home"})
    public String Hello(){
        return "Hello From Bridgelabz";
    }

}


package com.example.newhelloworld.controller;

import com.example.newhelloworld.controller.Entity.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hi")
public class HelloWebController {

    @GetMapping(value = {"","/","/home"})
    public String Hello(){
        return "Hello From Bridgelabz";
    }
    @GetMapping(value = {"/query"})
    public String sayHello(@RequestParam String name) {
        return " Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return " Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + "" + user.getLastName() + "!";
            }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + "" + lastName + "!";
    }
}


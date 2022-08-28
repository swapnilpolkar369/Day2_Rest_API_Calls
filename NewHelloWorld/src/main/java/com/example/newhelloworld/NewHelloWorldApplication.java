package com.example.newhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication

public class NewHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello hello");
        SpringApplication.run(NewHelloWorldApplication.class, args);
    }

}

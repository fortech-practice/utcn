package com.example.gitdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return createGreetingMessage("en");
    }

    private String createGreetingMessage(String language) {
        if ("en".equals(language)) {
            return "Good morning!";
        }
        if ("ro".equals(language)) {
            return "Buna dimineata!";
        }
        return "Hello!";
    }


    public static void start(){
        System.out.println("start");
    }
}

package com.example.gitdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return createGreetingMessage();
    }

    private String createGreetingMessage() {
        return "Cucu bau!";
    }


    public static void start(){
        System.out.println("start");
    }
}

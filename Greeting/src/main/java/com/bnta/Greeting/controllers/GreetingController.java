package com.bnta.Greeting.controllers;

import com.bnta.Greeting.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting getGreeting() {
        Greeting greeting = new Greeting();
        greeting.setName("Ramiro");
        greeting.setTimeOfDay("Good afternoon");
        return greeting;
    }
}

package com.restapimessagingapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/hello")
    public String message(){
        return "Hello from BridgeLabz";
    }

    @GetMapping(value = "/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz ";
    }
}

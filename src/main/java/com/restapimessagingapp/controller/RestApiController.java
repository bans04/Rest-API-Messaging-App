package com.restapimessagingapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/hello")
    public String message(){
        return "Hello from BridgeLabz";
    }
}

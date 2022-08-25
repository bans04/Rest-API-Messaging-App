package com.restapimessagingapp.controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz ";
    }
}

package com.coderarmy.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    public String hello(){
//        return  "Hello from controller";
//    }

//    http://localhost:8080/Hello
    @GetMapping("/Hello")
    public String route_method(){
//        return "Hello from route";
        return "<h1>Hello from route<h1>";
    }

}

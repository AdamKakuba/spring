package com.kakuba.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloAPI {

    @GetMapping("/api/hello")
    public String sayHello(){
        return "hello!" ;}
}

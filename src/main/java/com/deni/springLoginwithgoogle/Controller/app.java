package com.deni.springLoginwithgoogle.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/login")
    public String login() {
        return "Login with google berhasil";
    }
}

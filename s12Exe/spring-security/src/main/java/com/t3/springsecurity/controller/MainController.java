package com.t3.springsecurity.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "<h1> Pagina Inicial </h1>";
    }

    @GetMapping("/private")
    public String privatePage(){
        return "<h1> Pagina Secreta </h1>";
    }

    @GetMapping("/userinfo")
    public Map<String, Object> userinfo(@AuthenticationPrincipal OAuth2User user){
        Map<String, Object> atributes = user.getAttributes();

        return atributes; 
    }
    
}

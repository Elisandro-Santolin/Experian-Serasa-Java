package com.t3.springmvcthymeleaf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting") // ## PEGA INFORMAÇÃO DO SERVERSIDE E JOGA PARA O VIEW ## //
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World")String name, Model model) {  
        
        
        model.addAttribute("name", name);
        return "greetingView";
    }    
}

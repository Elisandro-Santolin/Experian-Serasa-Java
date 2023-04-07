package com.t3.getepost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    
    @GetMapping("/foobar")
    public String fooGet(Model model){ // ## METODO ## //
        model.addAttribute("person", new Person());      
        return "foo";
    }
    
    @PostMapping("/foobar")
    public String barPost(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        return "bar";
    }
}

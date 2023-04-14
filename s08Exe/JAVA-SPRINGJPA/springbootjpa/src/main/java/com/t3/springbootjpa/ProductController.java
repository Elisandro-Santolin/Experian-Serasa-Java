package com.t3.springbootjpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private ProductRepository repository;

    
    public ProductController(ProductRepository repository){
        this.repository = repository;
    }
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/products/add")
    public String createProduct(Model model){
        model.addAttribute("product", new Product());
        return "addEdit";
    }

    @PostMapping("/products/save")
    public String saveProduct(Product product){
        repository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/products")
    public String getAllProducts(Model model){
        model.addAttribute("products", repository.findAll());
        return "products";
    }

    @GetMapping("/products/edit/{id}")
    public String editProduct(Model model, @PathVariable(value = "id") long id){
        model.addAttribute("product", repository.findById(id));
        return "addEdit";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable(value = "id") long id){
        repository.deleteById(id);
        return "redirect:/products";
    }
}
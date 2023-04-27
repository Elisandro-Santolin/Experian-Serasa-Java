package com.t3.onetomanyuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.t3.onetomanyuni.entity.Cart;
import com.t3.onetomanyuni.entity.Product;
import com.t3.onetomanyuni.repository.CartRepository;
import com.t3.onetomanyuni.repository.ProductRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public void run(String... args) throws Exception {
        createCart();
        retrieverCart(1L);
    
    }
    
    public void createCart(){

    // criamos um carrinho de compras
        Cart cart1 = new Cart();
        cart1.setColor("verde");

    // criamos o produto 1

        Product product1 = new Product();
        //product1.setId(0);
        product1.setName("Leite");
        product1.setPrice(5);
        product1.setQuantity(12);

        Product product2 = new Product();
        //product1.setId(0);
        product2.setName("Feijao");
        product2.setPrice(13);
        product2.setQuantity(8);

        Product product3 = new Product();
        //product1.setId(0);
        product3.setName("Arroz");
        product3.setPrice(21);
        product3.setQuantity(4);

        // adicionamos o product no cart1
        cart1.add(product3);

        cartRepository.save(cart1);
    }

    public void retrieverCart(Long id){
        Cart cart = cartRepository.findById(id).get();
        
        System.out.println("Print Cart info: ");
        System.out.println(cart.toString());

        cart.getCartProducts().forEach(product -> {
            System.out.println(product.toString());

        });
    }

    
}

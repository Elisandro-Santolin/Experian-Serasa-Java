package com.t3.onetomanybi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.t3.onetomanybi.entity.Cart;
import com.t3.onetomanybi.entity.Product;
import com.t3.onetomanybi.repository.CartRepository;
import com.t3.onetomanybi.repository.ProductRepository;

import jakarta.transaction.Transactional;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception { 
        //createCart();

        // System.out.println("Get a product with id 1");
        // Product product = productRepository.findById(1L).get();
        // System.out.println(product.toString());

        retrieveCart(1L);
    }

    public void createCart() {

        // Criamos um carrinho
        Cart cart1 = new Cart();
        cart1.setColor("Verde");

        // Criamos o produto 1
        Product product1 = new Product();
        product1.setName("Leite");
        product1.setPrice(5);
        product1.setQuantity(12);
        
        // Adicionamos o product1 no cart1
        product1.setMyCart(cart1);
        cart1.add(product1);

        // Criamos o produto 2
        Product product2 = new Product();
        product2.setName("Arroz");
        product2.setPrice(12);
        product2.setQuantity(1);

        // Adicionamos o product2 no cart1
        product2.setMyCart(cart1);
        cart1.add(product2);

        // Criamos o produto 3
        Product product3 = new Product();
        product3.setName("Feijão");
        product3.setPrice(6);
        product3.setQuantity(2);

        // Adicionamos o product3 no cart1
        product3.setMyCart(cart1);
        cart1.add(product3);

        //Salvamos no nosso banco
        cartRepository.save(cart1);

    }

    public void retrieveCart(Long id){
        Cart cart = cartRepository.findById(id).get();
        
        //Imprime o carrinho retornado
        System.out.println("Print Cart info: ");
        System.out.println(cart.toString());

        //Imprime cada um dos produtos do carrinho
        System.out.println("Print Products info: ");
        cart.getCartProducts().forEach((product -> {
            System.out.println(product.toString());
        }));
    }

    public void retrieveProduct(Long id){
        Product product = productRepository.findById(id).get();

        //Imprime o produto retornado
        System.out.println("Print Product info: ");
        System.out.println(product.toString());

        //Imprime o carrinho do produto
        System.out.println("Print Cart Info:");
        System.out.println(product.getMyCart().toString());
    }
    
    public void retrieveCartByColor(String color){
        List<Cart> carts = cartRepository.findByColorIgnoreCase(color);

        carts.forEach(cart -> {
            System.out.println(cart.toString());
        });
    }

    public void retrieveProductByPrice(int price){
        List<Product> products = productRepository.findByPrice(price);

        products.forEach(product -> {
            System.out.println(product.toString());
        });
    }
}

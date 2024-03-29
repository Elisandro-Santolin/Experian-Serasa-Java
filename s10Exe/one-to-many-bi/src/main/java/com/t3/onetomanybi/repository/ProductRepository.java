package com.t3.onetomanybi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.onetomanybi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByPrice(int price);
    
}

package com.t3.onetomanyuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.onetomanyuni.entity.*;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    
}

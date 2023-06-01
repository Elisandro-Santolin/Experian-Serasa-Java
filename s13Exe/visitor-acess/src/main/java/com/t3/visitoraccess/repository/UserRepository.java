package com.t3.visitoraccess.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.visitoraccess.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUsername(String username);
    
}
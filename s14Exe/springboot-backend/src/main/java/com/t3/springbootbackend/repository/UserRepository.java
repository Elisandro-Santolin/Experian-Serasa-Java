package com.t3.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.t3.springbootbackend.entity.User;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
   //repository é uma ponte do backend com o banco  

    Optional<User> findByUsername(String username); //findBy - busca no banco o dado, sintaxe do JPA 

}

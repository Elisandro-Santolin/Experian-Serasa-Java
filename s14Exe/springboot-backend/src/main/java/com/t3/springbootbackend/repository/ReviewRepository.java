package com.t3.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.t3.springbootbackend.entity.Review;
import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {


    
}

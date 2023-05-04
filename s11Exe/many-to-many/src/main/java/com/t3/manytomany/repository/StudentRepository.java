package com.t3.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.manytomany.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}

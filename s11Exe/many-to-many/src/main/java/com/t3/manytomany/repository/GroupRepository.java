package com.t3.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.manytomany.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long>{
    Group findByName(String name);    
}

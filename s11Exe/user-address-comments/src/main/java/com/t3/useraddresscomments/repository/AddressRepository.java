package com.t3.useraddresscomments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.useraddresscomments.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}

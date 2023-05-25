package com.t3.springbootbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.t3.springbootbackend.entity.Location;
import java.util.List;
import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID>{
    
    List<Location> findByName(String name); //retorna o resultado exato 

    List<Location> findByCity(String city);

}

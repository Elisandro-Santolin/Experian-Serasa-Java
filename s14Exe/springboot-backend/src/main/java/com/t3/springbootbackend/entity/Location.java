package com.t3.springbootbackend.entity;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "locations")
@Getter @Setter @NoArgsConstructor
public class Location {
    
    @Id
    @GenericGenerator(name = "UUIDGeneration", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGeneration")
    @Column(name = "id", updatable = false)
    private UUID id; //UUID identificador unico universal 

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    private String discrict;

    @Column(nullable = false)
    private String street;

    private String complement;

    private int number;

    @Column(name =  "location_type")
    private String locationType;

    @Column(name = "accessibility_stars")
    private float acessibilityStars;

    private String description;

}

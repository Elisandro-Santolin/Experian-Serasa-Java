package com.t3.springbootbackend.entity;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.UUID;
import java.util.Set;
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

    @OneToMany(mappedBy = "location") //lado inverso -> sempre dizer o que procurar Ex.:propriedade do lado dono
    private Set<Review> myReviews = new HashSet<>();

    public Location(String name, String cep, String country, String state, String city, String discrict, String street,
            String complement, int number, String locationType, float acessibilityStars, String description) {
        this.name = name;
        this.cep = cep;
        this.country = country;
        this.state = state;
        this.city = city;
        this.discrict = discrict;
        this.street = street;
        this.complement = complement;
        this.number = number;
        this.locationType = locationType;
        this.acessibilityStars = acessibilityStars;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location [id=" + id + ", name=" + name + ", cep=" + cep + ", country=" + country + ", state=" + state
                + ", city=" + city + ", discrict=" + discrict + ", street=" + street + ", complement=" + complement
                + ", number=" + number + ", locationType=" + locationType + ", acessibilityStars=" + acessibilityStars
                + ", description=" + description + "]";
    }
}

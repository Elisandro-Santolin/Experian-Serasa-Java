package com.t3.springbootbackend.entity;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class User {
    
    @Id
    @GenericGenerator(name = "UUIDGeneration", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGeneration")
    @Column(name = "id", updatable = false)
    private UUID id; //UUID identificador unico universal 

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String roles;
    
    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "user") //lado inverso -> sempre dizer o que procurar Ex.:propriedade do lado dono
    private Set<Review> myReviews = new HashSet<>();

    public User(String username, String password, String roles, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + ", email="
                + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }   
}   

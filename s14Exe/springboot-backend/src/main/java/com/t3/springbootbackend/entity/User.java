package com.t3.springbootbackend.entity;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
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


}

package com.t3.springonetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Define a classe como uma entidade
@Table(name="persons")
@Getter @Setter @NoArgsConstructor // modo preguiça ## lombok ## gera para você todo os construtor //
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;  // ## primary key ## //

    @Column(name = "name")
    private String name;

    @Column(name = "chacacter_level")
    private int characterLevel;

    @Column(name = "chacacter_class")
    private int characterClass;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id", referencedColumnName = "id")
    private Pet petId;

}


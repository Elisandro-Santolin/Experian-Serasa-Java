package com.t3.springonetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Define a classe como uma entidade
@Table(name="characters")
@Getter @Setter @NoArgsConstructor // modo preguiça ## lombok ## gera para você todo os construtor //
public class Pet {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;  // ## primary key ## //

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "color")
    private int color;

    @Column(name = "pet_level")
    private int petLevel;
    
}

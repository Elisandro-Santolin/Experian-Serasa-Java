package com.t3.onetomanybi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_id")
@Getter @Setter @NoArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;

    private int quantity;

     // lado dono
    @ManyToOne (fetch = FetchType.LAZY) //LAZY EAGER ESPECIE DE ENUM
    @JoinColumn(name = "cart_id") 
    private Cart myCart;

}

package com.t3.useraddresscomments.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users_addresses")
@Getter @Setter @NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String cep;

    private String street;

    private int number;

    private String country;

    private String State;

    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;

    public Address(String cep, String street, int number, String country, String state, String city) {
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.country = country;
        State = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", cep=" + cep + ", street=" + street + ", number=" + number + ", country="
                + country + ", State=" + State + ", city=" + city + "]";
    } 
   
}

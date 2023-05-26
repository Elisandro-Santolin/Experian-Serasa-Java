package com.t3.springbootbackend.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;
import lombok.*;

@Entity
@Table
@Getter @Setter @NoArgsConstructor
public class Review {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false)
    private UUID id;  

    @Column(name = "review_score")
    private float reviewScore;

    private String comment;

    @CreationTimestamp
    @Column(name = "publication_date")
    private Date publicationDate;
    
    @ManyToOne
    @JoinColumn(name = "user_id") //lado dono 
    private User user;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Override
    public String toString() {
        return "Review [id=" + id + ", reviewScore=" + reviewScore + ", comment=" + comment + ", publicationDate="
                + publicationDate + ", \n \n user=" + user + ", \n \n location=" + location + "]";
    }


}

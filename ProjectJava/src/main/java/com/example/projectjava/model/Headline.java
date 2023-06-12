package com.example.projectjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "headlines")
public class Headline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "post", columnDefinition = "VARCHAR NOT NULL")
    private String post;
    @Column(name = "date")
    private Date date;

    /**
     * Setting date of creation
     */
    @PrePersist
    protected void onCreate() {
        date = new Date();
    }
}
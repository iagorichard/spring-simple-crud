package com.poo.aula.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length=30, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User owner;

}
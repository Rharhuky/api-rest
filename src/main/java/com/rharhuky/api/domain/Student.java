package com.rharhuky.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "registration")
    private String registration;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @PrePersist
    public void createRegistration(){
        this.registration = String.valueOf(System.currentTimeMillis());
    }

    @PrePersist
    public void creationDate(){
        this.creationDate = LocalDate.now();
    }

}

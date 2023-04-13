package com.example.Aproject.Entity;
import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.time.LocalDate;


@Entity
@Table(name="libredemandeentity")

public class LibreDemandeEntity {
  @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name ="nom" ,nullable = false)
 private int nom;

    @Column(name ="prenom" ,nullable = false)
    private int prenom;
    @Column(name ="age" ,nullable = false)
    private int age;

    }


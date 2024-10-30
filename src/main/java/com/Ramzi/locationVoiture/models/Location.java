package com.Ramzi.locationVoiture.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Date date_debut;
    private Date date_retour;
    private Long prix_jour;
    private Long prix;
    @ManyToOne
    private Client client;
    @ManyToOne
    private  Voiture voiture;







}

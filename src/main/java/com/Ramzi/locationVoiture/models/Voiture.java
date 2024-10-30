package com.Ramzi.locationVoiture.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serie;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_Mise_En_Marche;
    @OneToMany(mappedBy = "voiture")
    private Collection<Location> locations ;
    @ManyToOne
    private Modele modeles;

}

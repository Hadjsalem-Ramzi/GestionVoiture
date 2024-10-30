package com.Ramzi.locationVoiture.controllers;
import com.Ramzi.locationVoiture.models.Modele;
import com.Ramzi.locationVoiture.models.Voiture;
import com.Ramzi.locationVoiture.security.services.ModeleServiceImp;
import com.Ramzi.locationVoiture.security.services.VoitureServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voiture")
public class VoitureRestController {
    @Autowired
    private VoitureServiceImp voitureServiceImp;
    @Autowired
    private ModeleServiceImp modeleServiceImp;

    @PostMapping("/save/{idmodel}")
    public Voiture saveVoiture(@RequestBody Voiture voiture, @PathVariable Long idmodel){
            Modele m1 =modeleServiceImp.getModeleByID(idmodel);
            voiture.setModeles(m1);
        return  voitureServiceImp.createVoiture(voiture);
    }
    @PostMapping("/save2/{idmodel}")
    public ResponseEntity<Voiture> createVoiture(@RequestBody Voiture  voiture,@PathVariable Long idmodel){
        try {
            Modele m1 =modeleServiceImp.getModeleByID(idmodel);
            voiture.setModeles(m1);
            voitureServiceImp.createVoiture(voiture);
            return new ResponseEntity<Voiture>(voiture, HttpStatus.CREATED);
        }catch(Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}

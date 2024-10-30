package com.Ramzi.locationVoiture.security.services;

import com.Ramzi.locationVoiture.models.Voiture;

import java.util.List;

public interface VoitureService {
   // Voiture getVoitureByModel(String model);
    Voiture getVoitureByID(Long id);
    List<Voiture> getAllVoiture();
    void deleteVoiture(Long id);
    Voiture updateVoiture(Voiture nom);

    Voiture createVoiture(Voiture voiture);
}

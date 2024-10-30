package com.Ramzi.locationVoiture.repository;
import com.Ramzi.locationVoiture.models.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}

package com.Ramzi.locationVoiture.repository;
import com.Ramzi.locationVoiture.models.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Modele,Long> {
}

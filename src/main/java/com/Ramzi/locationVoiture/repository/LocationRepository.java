package com.Ramzi.locationVoiture.repository;
import com.Ramzi.locationVoiture.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {


}

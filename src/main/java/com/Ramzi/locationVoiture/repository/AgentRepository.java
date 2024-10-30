package com.Ramzi.locationVoiture.repository;


import com.Ramzi.locationVoiture.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {
}

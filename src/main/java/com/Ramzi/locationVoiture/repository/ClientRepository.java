package com.Ramzi.locationVoiture.repository;
import com.Ramzi.locationVoiture.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Client getClientByNom(String nom);
   /* @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Client getClientByNom(String nom){
        Query query=entityManager.createNativeQuery("select C.* FROM Client C"+"WERE C.nom Like ?",Client.class );
        query.setParameter(1,nom+"%");
        return (Client) query.getSingleResult();
    }*/
}

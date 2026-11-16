package tn.esprit.autolocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Paiement;
import tn.esprit.autolocation.entities.Reservation;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {

}

package tn.esprit.autolocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Agence;
import tn.esprit.autolocation.entities.Reservation;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {

}

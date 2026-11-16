package tn.esprit.autolocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Equipement;
import tn.esprit.autolocation.entities.Reservation;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}

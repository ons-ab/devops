package tn.esprit.autolocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Reservation;
import tn.esprit.autolocation.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}

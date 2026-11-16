package tn.esprit.autolocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Employe;
import tn.esprit.autolocation.entities.Reservation;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}

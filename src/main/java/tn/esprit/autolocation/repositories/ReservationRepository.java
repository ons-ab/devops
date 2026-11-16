package tn.esprit.autolocation.repositories;

import org.aspectj.weaver.ast.And;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocation.entities.Reservation;
import tn.esprit.autolocation.entities.StatutReservation;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByDateDebutGreaterThan(LocalDate d);
    List<Reservation> findAllByDateFinBetweenAndStatut(LocalDate debut, LocalDate fin, StatutReservation s);

}

package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Reservation;
import tn.esprit.autolocation.entities.StatutReservation;
import tn.esprit.autolocation.repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService{

    private final ReservationRepository rrep;


    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return rrep.save(reservation);
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        rrep.deleteById(idReservation);

    }

    @Override
    public Reservation modfierReservation(Reservation reservation) {
        return rrep.save(reservation);
    }

    @Override
    public List<Reservation> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Reservation reservationParId(Long idReservation) {
        return rrep.findById(idReservation).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Reservation> ajouterListe(List<Reservation> reservations) {
        return rrep.saveAll(reservations);
    }

    @Override
    public List<Reservation> selectRByDB(LocalDate date) {
        return rrep.findByDateDebutGreaterThan(date);
    }

    @Override
    public List<Reservation> selectByFinEtStatut(LocalDate debut, LocalDate fin, StatutReservation s) {
        return rrep.findAllByDateFinBetweenAndStatut(debut, fin, s);
    }


}


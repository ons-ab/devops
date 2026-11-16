package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Reservation;
import tn.esprit.autolocation.entities.StatutReservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {

    Reservation ajouterReservation(Reservation reservation);
    void supprimerReservation(Long  idReservation);
    Reservation modfierReservation(Reservation reservation);
    List<Reservation> afficherListe();
    Reservation reservationParId(Long idReservation);
    List<Reservation> ajouterListe(List <Reservation> reservations);

    List<Reservation> selectRByDB(LocalDate date);
    List<Reservation> selectByFinEtStatut (LocalDate debut, LocalDate fin, StatutReservation s);




}


package tn.esprit.autolocation.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocation.entities.Reservation;
import tn.esprit.autolocation.entities.StatutReservation;
import tn.esprit.autolocation.services.IReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final IReservationService ires;

    // Ajouter une réservation
    @PostMapping("/addR")
    public Reservation ajouterR(@RequestBody Reservation reservation) {
        return ires.ajouterReservation(reservation);
    }

    // Supprimer une réservation
    @DeleteMapping("/deletes/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation) {
        ires.supprimerReservation(idReservation);
    }

    // Modifier une réservation
    @PutMapping("/updateR")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return ires.modfierReservation(reservation);
    }

    // Afficher toutes les réservations
    @GetMapping("/all")
    public List<Reservation> afficherListe() {
        return ires.afficherListe();
    }

    // Afficher une réservation par son ID
    @GetMapping("/{idReservation}")
    public Reservation reservationParId(@PathVariable Long idReservation) {
        return ires.reservationParId(idReservation);
    }

    // Ajouter plusieurs réservations
    @PostMapping("/addList")
    public List<Reservation> ajouterListe(
            @RequestBody List<Reservation> reservations) {
        return ires.ajouterListe(reservations);
    }

    @GetMapping("/searchByDate/{date}")
    public List<Reservation> selectRByDB(@PathVariable LocalDate date) {
        return ires.selectRByDB(date);
    }

    @GetMapping("/selectByFinEtStatut/{debut}/{fin}/{s}")
    public List<Reservation> selectByFinEtStatut
            (@PathVariable LocalDate debut,
             @PathVariable LocalDate fin,
             @PathVariable StatutReservation s ) {
        return ires.selectByFinEtStatut(debut ,fin,s);
    }

}
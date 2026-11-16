package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);

    void supprimerPaiement(Long idPaiement);

    Paiement modfierPaiement(Paiement paiement);

    List<Paiement> afficherListe();

    Paiement paiementParId(Long idPaiement);

    List<Paiement> ajouterListe(List<Paiement> paiements);
}

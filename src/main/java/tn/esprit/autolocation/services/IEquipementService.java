package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);

    void supprimerEquipement(Long idEquipement);

    Equipement modfierEquipement(Equipement equipement);

    List<Equipement> afficherListe();

    Equipement equipementParId(Long idEquipement);

    List<Equipement> ajouterListe(List<Equipement> equipements);
}

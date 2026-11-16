package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);

    void supprimerVehicule(Long idVehicule);

    Vehicule modfierVehicule(Vehicule vehicule);

    List<Vehicule> afficherListe();

    Vehicule vehiculeParId(Long idVehicule);

    List<Vehicule> ajouterListe(List<Vehicule> vehicules);
}

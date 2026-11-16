package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);

    void supprimerContrat(Long idContrat);

    Contrat modfierContrat(Contrat contrat);

    List<Contrat> afficherListe();

    Contrat contratParId(Long idContrat);

    List<Contrat> ajouterListe(List<Contrat> contrats);
}

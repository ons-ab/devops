package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);

    void supprimerAgence(Long idAgence);

    Agence modfierAgence(Agence agence);

    List<Agence> afficherListe();

    Agence agenceParId(Long idAgence);

    List<Agence> ajouterListe(List<Agence> agences);
}

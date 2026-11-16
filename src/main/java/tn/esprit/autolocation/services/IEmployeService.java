package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);

    void supprimerEmploye(Long idEmploye);

    Employe modfierEmploye(Employe employe);

    List<Employe> afficherListe();

    Employe employeParId(Long idEmploye);

    List<Employe> ajouterListe(List<Employe> employes);
}

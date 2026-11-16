package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);

    void supprimerMaintenance(Long idMaintenance);

    Maintenance modfierMaintenance(Maintenance maintenance);

    List<Maintenance> afficherListe();

    Maintenance maintenanceParId(Long idMaintenance);

    List<Maintenance> ajouterListe(List<Maintenance> maintenances);
}

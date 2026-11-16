package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Maintenance;
import tn.esprit.autolocation.repositories.MaintenanceRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class MaintenanceServiceImpl implements IMaintenanceService{

    private final MaintenanceRepository rrep;


    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return rrep.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long idMaintenance) {
        rrep.deleteById(idMaintenance);

    }

    @Override
    public Maintenance modfierMaintenance(Maintenance maintenance) {
        return rrep.save(maintenance);
    }

    @Override
    public List<Maintenance> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Maintenance maintenanceParId(Long idMaintenance) {
        return rrep.findById(idMaintenance).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Maintenance> ajouterListe(List<Maintenance> maintenances) {
        return rrep.saveAll(maintenances);
    }
}

package tn.esprit.autolocation.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Vehicule;
import tn.esprit.autolocation.repositories.VehiculeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeServiceImpl implements IVehiculeService{

    private final VehiculeRepository rrep;


    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return rrep.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long idVehicule) {
        rrep.deleteById(idVehicule);

    }

    @Override
    public Vehicule modfierVehicule(Vehicule vehicule) {
        return rrep.save(vehicule);
    }

    @Override
    public List<Vehicule> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Vehicule vehiculeParId(Long idVehicule) {
        return rrep.findById(idVehicule).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Vehicule> ajouterListe(List<Vehicule> vehicules) {
        return rrep.saveAll(vehicules);
    }
}

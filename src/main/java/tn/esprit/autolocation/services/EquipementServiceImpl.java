package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Equipement;
import tn.esprit.autolocation.repositories.EquipementRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class EquipementServiceImpl implements IEquipementService{

    private final EquipementRepository rrep;


    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return rrep.save(equipement);
    }

    @Override
    public void supprimerEquipement(Long idEquipement) {
        rrep.deleteById(idEquipement);

    }

    @Override
    public Equipement modfierEquipement(Equipement equipement) {
        return rrep.save(equipement);
    }

    @Override
    public List<Equipement> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Equipement equipementParId(Long idEquipement) {
        return rrep.findById(idEquipement).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Equipement> ajouterListe(List<Equipement> equipements) {
        return rrep.saveAll(equipements);
    }
}

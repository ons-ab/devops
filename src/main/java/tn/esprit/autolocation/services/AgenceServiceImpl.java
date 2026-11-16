package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Agence;
import tn.esprit.autolocation.repositories.AgenceRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class AgenceServiceImpl implements IAgenceService{

    private final AgenceRepository rrep;


    @Override
    public Agence ajouterAgence(Agence agence) {
        return rrep.save(agence);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
        rrep.deleteById(idAgence);

    }

    @Override
    public Agence modfierAgence(Agence agence) {
        return rrep.save(agence);
    }

    @Override
    public List<Agence> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Agence agenceParId(Long idAgence) {
        return rrep.findById(idAgence).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Agence> ajouterListe(List<Agence> agences) {
        return rrep.saveAll(agences);
    }
}

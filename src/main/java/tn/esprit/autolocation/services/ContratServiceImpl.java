package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Contrat;
import tn.esprit.autolocation.repositories.ContratRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ContratServiceImpl implements IContratService{

    private final ContratRepository rrep;


    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return rrep.save(contrat);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        rrep.deleteById(idContrat);

    }

    @Override
    public Contrat modfierContrat(Contrat contrat) {
        return rrep.save(contrat);
    }

    @Override
    public List<Contrat> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Contrat contratParId(Long idContrat) {
        return rrep.findById(idContrat).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Contrat> ajouterListe(List<Contrat> contrats) {
        return rrep.saveAll(contrats);
    }
}

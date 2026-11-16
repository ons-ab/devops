package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Paiement;
import tn.esprit.autolocation.repositories.PaiementRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PaiementServiceImpl implements IPaiementService{

    private final PaiementRepository rrep;


    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return rrep.save(paiement);
    }

    @Override
    public void supprimerPaiement(Long idPaiement) {
        rrep.deleteById(idPaiement);

    }

    @Override
    public Paiement modfierPaiement(Paiement paiement) {
        return rrep.save(paiement);
    }

    @Override
    public List<Paiement> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Paiement paiementParId(Long idPaiement) {
        return rrep.findById(idPaiement).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Paiement> ajouterListe(List<Paiement> paiements) {
        return rrep.saveAll(paiements);
    }
}

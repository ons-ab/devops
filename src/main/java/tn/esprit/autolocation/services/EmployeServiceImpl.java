package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Employe;
import tn.esprit.autolocation.repositories.EmployeRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class EmployeServiceImpl implements IEmployeService{

    private final EmployeRepository rrep;


    @Override
    public Employe ajouterEmploye(Employe employe) {
        return rrep.save(employe);
    }

    @Override
    public void supprimerEmploye(Long idEmploye) {
        rrep.deleteById(idEmploye);

    }

    @Override
    public Employe modfierEmploye(Employe employe) {
        return rrep.save(employe);
    }

    @Override
    public List<Employe> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Employe employeParId(Long idEmploye) {
        return rrep.findById(idEmploye).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Employe> ajouterListe(List<Employe> employes) {
        return rrep.saveAll(employes);
    }
}

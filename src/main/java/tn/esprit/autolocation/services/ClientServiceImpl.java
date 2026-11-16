package tn.esprit.autolocation.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.entities.Client;
import tn.esprit.autolocation.repositories.ClientRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements IClientService{

    private final ClientRepository rrep;


    @Override
    public Client ajouterClient(Client client) {
        return rrep.save(client);
    }

    @Override
    public void supprimerClient(Long idClient) {
        rrep.deleteById(idClient);

    }

    @Override
    public Client modfierClient(Client client) {
        return rrep.save(client);
    }

    @Override
    public List<Client> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Client clientParId(Long idClient) {
        return rrep.findById(idClient).orElse(null); // ou on utilise le truc de get()
    }

    @Override
    public List<Client> ajouterListe(List<Client> clients) {
        return rrep.saveAll(clients);
    }
}


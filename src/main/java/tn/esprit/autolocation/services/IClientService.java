package tn.esprit.autolocation.services;

import tn.esprit.autolocation.entities.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);

    void supprimerClient(Long idClient);

    Client modfierClient(Client client);

    List<Client> afficherListe();

    Client clientParId(Long idClient);

    List<Client> ajouterListe(List<Client> clients);
}

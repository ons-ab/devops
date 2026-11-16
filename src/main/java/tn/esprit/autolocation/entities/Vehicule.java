package tn.esprit.autolocation.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private BigDecimal tarifJournalier;


    @Enumerated(EnumType.STRING)
    private StatutVehicule statutVehicule;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorieVehicule;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;

    @ManyToMany
    private List<Equipement> equipements;

}

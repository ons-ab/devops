package tn.esprit.autolocation.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Employe> employes;
}

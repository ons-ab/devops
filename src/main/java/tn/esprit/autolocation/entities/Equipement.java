package tn.esprit.autolocation.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEquipement;
    private String libelle;

    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules;
}

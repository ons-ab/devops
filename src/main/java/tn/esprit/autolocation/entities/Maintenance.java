package tn.esprit.autolocation.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;

    @ManyToOne
    private Vehicule vehicule;
}
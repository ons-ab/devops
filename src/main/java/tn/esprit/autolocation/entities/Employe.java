package tn.esprit.autolocation.entities;


import jakarta.persistence.*;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long idEmploye;
    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    @ManyToOne
    private Agence agence;

}

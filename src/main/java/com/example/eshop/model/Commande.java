package com.example.eshop.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "commandes")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;


    @OneToMany(mappedBy = "commande" , cascade = CascadeType.ALL)
    private List<CommandeProduit> commandeProduits;
    
    @Column(name = "total_cout")
    private double totalCout;

    @Column(name = "adresse_livraison")
    private String adresseLivraison;

}

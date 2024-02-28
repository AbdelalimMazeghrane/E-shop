package com.example.eshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "panier_produits")
public class PanierProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "panier_id")
    private Panier panier;

    private int quantite;


    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier){
        this.panier = panier;
    }

    


    
}

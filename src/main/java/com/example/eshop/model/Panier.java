package com.example.eshop.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;


@Entity
@Table(name = "paniers")
public class Panier {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "panier", cascade = CascadeType.ALL)
    private List<PanierProduit> panierProduits;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;


    public List<PanierProduit> getPanierProduits(){
        return panierProduits;
    }

    public void setPanierProduits(List<PanierProduit> panierProduits){
        this.panierProduits = panierProduits;
    }

    
    
}



package com.example.eshop.repository;
import com.example.eshop.model.Commande;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long>{
    List<Commande> findByUtilisateurId(Long utilisateurId); 
}

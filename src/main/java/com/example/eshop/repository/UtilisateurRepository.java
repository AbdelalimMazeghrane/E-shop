package com.example.eshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.eshop.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    
}



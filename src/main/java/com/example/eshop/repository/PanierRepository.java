package com.example.eshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.eshop.model.Panier;
public interface PanierRepository extends JpaRepository<Panier,Long> {
    
}

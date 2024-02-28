package com.example.eshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.eshop.model.Produit;
import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
    List<Produit> findByCategory(String category);
}


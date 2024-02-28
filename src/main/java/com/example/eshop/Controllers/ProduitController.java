package com.example.eshop.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.model.Produit;
import com.example.eshop.repository.ProduitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



@RestController
@RequestMapping("/produits")


public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;


    @GetMapping("/allProduits")
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    @GetMapping("{category}")
    public List<Produit> getProduitsByCategory(@PathVariable String category){
        return produitRepository.findByCategory(category);
    } 


    
}

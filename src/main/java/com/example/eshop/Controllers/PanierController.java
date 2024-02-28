package com.example.eshop.Controllers;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.model.Panier;
import com.example.eshop.model.PanierProduit;
import com.example.eshop.repository.PanierRepository;

@RestController
@RequestMapping("/panier")
public class PanierController { 
    
    @Autowired 
    private PanierRepository panierRepository; // Correction du nom de la variable

    @PostMapping("/panier")
    public void addToPanier(@RequestBody PanierProduit panierProduit){
        panierRepository.save(panierProduit.getPanier());
    }

    @GetMapping("/produits")
    public List<PanierProduit> getPanierProduits(@RequestParam Long panierId){
        return panierRepository.findById(panierId)
                               .map(Panier::getPanierProduits)
                               .orElse(Collections.emptyList());
    }
}


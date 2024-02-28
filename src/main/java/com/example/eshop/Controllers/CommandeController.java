package com.example.eshop.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.eshop.model.Commande;
import com.example.eshop.repository.CommandeRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/commandes")
public class CommandeController{ 

    @Autowired
    private CommandeRepository commandeRepository;


    @PostMapping("/passerCommande")
    public void passerCommande(@RequestBody Commande commande) {
        commandeRepository.save(commande);
    }


    @GetMapping("/historique")
    public List<Commande> getHistoriqueCommandes(@RequestParam Long utilisateurId){
        return commandeRepository.findByUtilisateurId(utilisateurId);
    }
    
  

}


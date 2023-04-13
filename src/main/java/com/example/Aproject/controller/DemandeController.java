package com.example.Aproject.controller;

import com.example.Aproject.Entity.LibreDemandeEntity;

import com.example.Aproject.Repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Aproject.service.DemandeService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin (origins = "*")
@RestController
public class DemandeController {
    @Autowired
    private DemandeService demandeService;
    @GetMapping("/allDemand")
    public List<LibreDemandeEntity> getAllDemands() {
        return this.demandeService.getAllDemand();
    }
    @PostMapping("/addDemand")
    public void addDemand(@RequestBody LibreDemandeEntity libredemandeentity) {
        this.demandeService.addDemand(libredemandeentity);
    }
    @DeleteMapping("/deleteDemand/{id}")
    public void deleteDemand(@PathVariable("Id_Libre_Demande") Long Id_Libre_Demande) {
        this.demandeService.deleteDemand(Id_Libre_Demande);
    }



    }
package com.example.Aproject.service;


import com.example.Aproject.Entity.LibreDemandeEntity;
import com.example.Aproject.Repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class DemandeService {
    @Autowired
    private DemandeRepository demandeRepository;
    public List<LibreDemandeEntity> getAllDemand() {
        List<LibreDemandeEntity> demandes = new ArrayList<LibreDemandeEntity>();

            this.demandeRepository.findAll().forEach(LibreDemandeEntity -> {
                demandes.add(LibreDemandeEntity);
            });


        return demandes;
    }
    public void addDemand(LibreDemandeEntity libreDemandeEntity) {
        this.demandeRepository.save(libreDemandeEntity);
    }
    public void deleteDemand(Long Id_Libre_Demande) {
        this.demandeRepository.deleteById(Id_Libre_Demande);
    }








}

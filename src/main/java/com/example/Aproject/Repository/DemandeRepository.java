package com.example.Aproject.Repository;

import com.example.Aproject.Entity.LibreDemandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeRepository extends JpaRepository<LibreDemandeEntity,Long> {



}

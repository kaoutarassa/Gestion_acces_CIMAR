package com.GestionAccesCIMAR.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionAccesCIMAR.entities.Déclaration;

public interface DéclarationRepository extends JpaRepository<Déclaration, Integer> {

}

package com.GestionAccesCIMAR.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionAccesCIMAR.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, String> {

}

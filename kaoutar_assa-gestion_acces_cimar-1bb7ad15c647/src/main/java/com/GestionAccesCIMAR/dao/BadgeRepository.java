package com.GestionAccesCIMAR.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionAccesCIMAR.entities.Badge;

public interface BadgeRepository extends JpaRepository<Badge, Integer> {

}

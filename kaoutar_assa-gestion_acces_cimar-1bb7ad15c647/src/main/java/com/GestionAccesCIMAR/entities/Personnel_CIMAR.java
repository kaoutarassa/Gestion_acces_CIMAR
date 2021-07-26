package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Personnel_CIMAR implements Serializable {
	@Id
	private String Matricule;
	private String Nom;
	private String Prenom;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Categorie_CIMAR")
	private Catégorie_CIMAR Categorie_CIMAR;
	@OneToMany(mappedBy="personnel_CIMAR",fetch=FetchType.LAZY)
	private List<Stagiaire> stagiaires=new ArrayList<>();
	@OneToMany(mappedBy="personnelCIMAR",fetch=FetchType.LAZY)
	private List<Déclaration> déclarations=new ArrayList<>();
	
	public Personnel_CIMAR(String nom, String prenom,
			Catégorie_CIMAR categorie_CIMAR, List<Stagiaire> stagiaires,
			List<Déclaration> déclarations) {
		super();
		Nom = nom;
		Prenom = prenom;
		Categorie_CIMAR = categorie_CIMAR;
		this.stagiaires = stagiaires;
		this.déclarations = déclarations;
	}
	public Personnel_CIMAR(String matricule, String nom, String prenom) {
		super();
		Matricule = matricule;
		Nom = nom;
		Prenom = prenom;
	}
	public Personnel_CIMAR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String matricule) {
		Matricule = matricule;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Catégorie_CIMAR getCategorie_CIMAR() {
		return Categorie_CIMAR;
	}
	public void setCategorie_CIMAR(Catégorie_CIMAR categorie_CIMAR) {
		Categorie_CIMAR = categorie_CIMAR;
	}
	public List<Stagiaire> getStagiaires() {
		return stagiaires;
	}
	public void setStagiaires(List<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}
	public List<Déclaration> getDéclarations() {
		return déclarations;
	}
	public void setDéclarations(List<Déclaration> déclarations) {
		this.déclarations = déclarations;
	}
	
}

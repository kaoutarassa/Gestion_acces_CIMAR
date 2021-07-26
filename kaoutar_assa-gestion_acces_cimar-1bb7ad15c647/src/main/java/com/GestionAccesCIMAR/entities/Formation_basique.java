package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
public class Formation_basique implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Identifiant;
	@OneToMany(mappedBy="formation",fetch=FetchType.LAZY)
	private List<Suivi_formation> suivi_formations= new ArrayList<>();
	@ManyToMany
	@JoinTable(name="AvoirFormation",
	joinColumns=@JoinColumn(name="Identifiant"),
	inverseJoinColumns=@JoinColumn(name="CIN"))
	private List<Personne> personnes= new ArrayList<>();

	public Formation_basique(int identifiant) {
		super();
		Identifiant = identifiant;
	}

	public List<Suivi_formation> getSuivi_formations() {
		return suivi_formations;
	}

	public void setSuivi_formations(List<Suivi_formation> suivi_formations) {
		this.suivi_formations = suivi_formations;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public Formation_basique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdentifiant() {
		return Identifiant;
	}

	public void setIdentifiant(int identifiant) {
		Identifiant = identifiant;
	}
	

}

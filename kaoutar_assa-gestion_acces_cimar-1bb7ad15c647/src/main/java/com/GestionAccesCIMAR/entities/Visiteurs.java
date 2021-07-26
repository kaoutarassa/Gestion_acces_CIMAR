package com.GestionAccesCIMAR.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Visiteurs")
public class Visiteurs extends Personne{

	private String Etablissement ;
	

	public Visiteurs(String cIN, String nom, String prenom) {
		super(cIN, nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public Visiteurs(String cIN, String nom, String prenom, String etablissement) {
		super(cIN, nom, prenom);
		Etablissement = etablissement;
	}

	public Visiteurs(String etablissement) {
		super();
		Etablissement = etablissement;
	}

	public Visiteurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEtablissement() {
		return Etablissement;
	}

	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}
	

}

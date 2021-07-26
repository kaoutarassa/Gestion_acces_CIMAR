package com.GestionAccesCIMAR.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Stagiaire")
public class Stagiaire extends Personne {
	private Date DateDebut;
	private Date DateFin;
	private String Etablissement;
	
	public Stagiaire(Date dateDebut, Date dateFin, String etablissement) {
		super();
		DateDebut = dateDebut;
		DateFin = dateFin;
		Etablissement = etablissement;
	}

	public Stagiaire(String cIN, String nom, String prenom, Date dateDebut,
			Date dateFin, String etablissement) {
		super(cIN, nom, prenom);
		DateDebut = dateDebut;
		DateFin = dateFin;
		Etablissement = etablissement;
	}
	public Stagiaire() {
		
	}
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	public String getEtablissement() {
		return Etablissement;
	}
	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}
	
	

}

package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Categorie_Soutraitant implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Num_Categorie_Soutraitant;
	private String Transporteur;
	private String Regie;
	private String Permanent;
	private String GE;
	private String Prestation;
	@OneToMany(mappedBy="soutraitant",fetch=FetchType.LAZY)
	private List<Soutraitant> soutraitants= new ArrayList<>();
	public Categorie_Soutraitant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie_Soutraitant(String transporteur, String regie,
			String permanent, String gE, String prestation) {
		super();
		Transporteur = transporteur;
		Regie = regie;
		Permanent = permanent;
		GE = gE;
		Prestation = prestation;
	}
	public int getNum_Categorie_Soutraitant() {
		return Num_Categorie_Soutraitant;
	}
	public void setNum_Categorie_Soutraitant(int num_Categorie_Soutraitant) {
		Num_Categorie_Soutraitant = num_Categorie_Soutraitant;
	}
	public String getTransporteur() {
		return Transporteur;
	}
	public void setTransporteur(String transporteur) {
		Transporteur = transporteur;
	}
	public String getRegie() {
		return Regie;
	}
	public void setRegie(String regie) {
		Regie = regie;
	}
	public String getPermanent() {
		return Permanent;
	}
	public void setPermanent(String permanent) {
		Permanent = permanent;
	}
	public String getGE() {
		return GE;
	}
	public void setGE(String gE) {
		GE = gE;
	}
	public String getPrestation() {
		return Prestation;
	}
	public void setPrestation(String prestation) {
		Prestation = prestation;
	}
	public List<Soutraitant> getSoutraitants() {
		return soutraitants;
	}
	public void setSoutraitants(List<Soutraitant> soutraitants) {
		this.soutraitants = soutraitants;
	}
	

}

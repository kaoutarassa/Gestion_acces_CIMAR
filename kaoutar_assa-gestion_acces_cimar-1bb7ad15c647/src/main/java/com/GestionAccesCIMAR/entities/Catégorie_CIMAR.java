package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Catégorie_CIMAR implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Categorie_CIMAR;
	private  boolean Cadre;
	private  boolean Employé;
	@OneToMany(mappedBy="Categorie_CIMAR",fetch=FetchType.LAZY)
	private List<Personnel_CIMAR> personel_cimar=new ArrayList<>();
	@OneToMany(mappedBy="Categorie_CIMAR")
	private Collection<Personnel_CIMAR> personnel_CIMAR;
	
	public Catégorie_CIMAR(boolean cadre, boolean employé,
			List<Personnel_CIMAR> personel_cimar,
			Collection<Personnel_CIMAR> personnel_CIMAR) {
		super();
		Cadre = cadre;
		Employé = employé;
		this.personel_cimar = personel_cimar;
		this.personnel_CIMAR = personnel_CIMAR;
	}
	public int getCategorie_CIMAR() {
		return Categorie_CIMAR;
	}
	public void setCategorie_CIMAR(int categorie_CIMAR) {
		Categorie_CIMAR = categorie_CIMAR;
	}
	public boolean isCadre() {
		return Cadre;
	}
	public void setCadre(boolean cadre) {
		Cadre = cadre;
	}
	public boolean isEmployé() {
		return Employé;
	}
	public void setEmployé(boolean employé) {
		Employé = employé;
	}
	public List<Personnel_CIMAR> getPersonel_cimar() {
		return personel_cimar;
	}
	public void setPersonel_cimar(List<Personnel_CIMAR> personel_cimar) {
		this.personel_cimar = personel_cimar;
	}
	public Collection<Personnel_CIMAR> getPersonnel_CIMAR() {
		return personnel_CIMAR;
	}
	public void setPersonnel_CIMAR(Collection<Personnel_CIMAR> personnel_CIMAR) {
		this.personnel_CIMAR = personnel_CIMAR;
	}
	public Catégorie_CIMAR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catégorie_CIMAR(boolean cadre, boolean employé) {
		super();
		Cadre = cadre;
		Employé = employé;
	}





}

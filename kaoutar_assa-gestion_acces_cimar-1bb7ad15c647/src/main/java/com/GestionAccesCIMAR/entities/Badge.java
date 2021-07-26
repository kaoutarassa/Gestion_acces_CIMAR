package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Badge implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int NumBadge;
	@OneToMany(mappedBy="badge",fetch=FetchType.LAZY)
	private List<Personne> personnes=new ArrayList<>() ;
	@ManyToOne
	@JoinColumn(name="id_Type_Badge")
	private TypeBadge typebadge;
	public Badge() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Badge(List<Personne> personnes, TypeBadge typebadge) {
		super();
		this.personnes = personnes;
		this.typebadge = typebadge;
	}



	public int getNumBadge() {
		return NumBadge;
	}



	public void setNumBadge(int numBadge) {
		NumBadge = numBadge;
	}



	public TypeBadge getTypebadge() {
		return typebadge;
	}



	public void setTypebadge(TypeBadge typebadge) {
		this.typebadge = typebadge;
	}



	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	
	
}

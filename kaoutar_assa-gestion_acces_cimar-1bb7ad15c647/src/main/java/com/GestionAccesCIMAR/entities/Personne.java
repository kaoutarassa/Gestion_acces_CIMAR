package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;





@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_Personne",discriminatorType=DiscriminatorType.STRING)
public abstract class Personne implements Serializable{
	@Id
	@Column(length=20)
	private String CIN;
	private String Nom;
	private String Prenom;

	@ManyToOne
	@JoinColumn(name="Personnel_cimar")
	private Personnel_CIMAR  personnel_CIMAR;
	@ManyToOne
	@JoinColumn(name="Categorie_Soutraitant")
	private Categorie_Soutraitant soutraitant;
	@OneToMany(mappedBy="soutraitant",fetch=FetchType.LAZY)
	private List<Passation> passations =new ArrayList<>();
    @ManyToOne
	@JoinColumn(name="NumBadge")
	private Badge badge;
	//@OneToMany(mappedBy="SuiviVehicule")
	@OneToMany(mappedBy="personne")
	private Collection<Déclaration> declarations ;
	@ManyToMany(mappedBy="personnes")
	private Collection<Formation_basique> formations;
	
	
	public Personne(String cIN, String nom, String prenom) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
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
	public Badge getBadge() {
		return badge;
	}
	public void setBadge(Badge badge) {
		this.badge = badge;
	}
	public Collection<Déclaration> getDeclarations() {
		return declarations;
	}
	public void setDeclarations(List<Déclaration> declarations) {
		this.declarations = declarations;
	}
	public Collection<Formation_basique> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation_basique> formations) {
		this.formations = formations;
	}
	public Personnel_CIMAR getPersonnel_CIMAR() {
		return personnel_CIMAR;
	}
	public void setPersonnel_CIMAR(Personnel_CIMAR personnel_CIMAR) {
		this.personnel_CIMAR = personnel_CIMAR;
	}
	public Categorie_Soutraitant getSoutraitant() {
		return soutraitant;
	}
	public void setSoutraitant(Categorie_Soutraitant soutraitant) {
		this.soutraitant = soutraitant;
	}
	public List<Passation> getPassations() {
		return passations;
	}
	public void setPassassions(List<Passation> passations) {
		this.passations = passations;
	}
	public void setDeclarations(Collection<Déclaration> declarations) {
		this.declarations = declarations;
	}
	public void setFormations(Collection<Formation_basique> formations) {
		this.formations = formations;
	}
	public Personne(String nom, String prenom, Personnel_CIMAR personnel_CIMAR,
			Categorie_Soutraitant soutraitant, List<Passation> passations,
			Badge badge, Collection<Déclaration> declarations,
			Collection<Formation_basique> formations) {
		super();
		Nom = nom;
		Prenom = prenom;
		this.personnel_CIMAR = personnel_CIMAR;
		this.soutraitant = soutraitant;
		this.passations = passations;
		this.badge = badge;
		this.declarations = declarations;
		this.formations = formations;
	}
	
	
	
}

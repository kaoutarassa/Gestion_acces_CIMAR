package com.GestionAccesCIMAR.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Chauffeur")
public class Chauffeurs extends Personne {

 private String Permis;
 private boolean Autorise;
 //constructors
public Chauffeurs() {
	super();
	// TODO Auto-generated constructor stub
}

public Chauffeurs(String cIN, String nom, String prenom, String permis,
		boolean autorise) {
	super(cIN, nom, prenom);
	Permis = permis;
	Autorise = autorise;
}

public Chauffeurs(String nom, String prenom, Personnel_CIMAR personnel_CIMAR,
		Categorie_Soutraitant soutraitant, List<Passation> passations,
		Badge badge, Collection<Déclaration> declarations,
		Collection<Formation_basique> formations) {
	super(nom, prenom, personnel_CIMAR, soutraitant, passations, badge,
			declarations, formations);
	// TODO Auto-generated constructor stub
}

public Chauffeurs(String cIN, String nom, String prenom) {
	super(cIN, nom, prenom);
	// TODO Auto-generated constructor stub
}
//getters et setters
public String getPermis() {
	return Permis;
}
public void setPermis(String permis) {
	Permis = permis;
}
public boolean isAutorise() {
	return Autorise;
}
public void setAutorise(boolean autorise) {
	Autorise = autorise;
}

}

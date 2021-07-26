package com.GestionAccesCIMAR.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Soutraitant")
public class Soutraitant extends Personne{
	private String Telephone;
	private boolean Autorise;
	
	
	
	

	public Soutraitant(String telephone, boolean autorise) {
		super();
		Telephone = telephone;
		Autorise = autorise;
	}







	public Soutraitant(String nom, String prenom,
			Personnel_CIMAR personnel_CIMAR, Categorie_Soutraitant soutraitant,
			List<Passation> passations, Badge badge,
			Collection<Déclaration> declarations,
			Collection<Formation_basique> formations, String telephone,
			boolean autorise) {
		super(nom, prenom, personnel_CIMAR, soutraitant, passations, badge,
				declarations, formations);
		Telephone = telephone;
		Autorise = autorise;
	}



	



	public Soutraitant(String nom, String prenom,
			Personnel_CIMAR personnel_CIMAR, Categorie_Soutraitant soutraitant,
			List<Passation> passations, Badge badge,
			Collection<Déclaration> declarations,
			Collection<Formation_basique> formations) {
		super(nom, prenom, personnel_CIMAR, soutraitant, passations, badge,
				declarations, formations);
		// TODO Auto-generated constructor stub
	}



	public Soutraitant(String cIN, String nom, String prenom) {
		super(cIN, nom, prenom);
		// TODO Auto-generated constructor stub
	}



	public Soutraitant(String string, String string2, Personnel_CIMAR pc1,
			Categorie_Soutraitant cs1, Object object, Badge b1, Déclaration d1,
			Formation_basique f1, String string3, boolean b) {
		// TODO Auto-generated constructor stub
	}







	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public boolean isAutorise() {
		return Autorise;
	}
	public void setAutorise(boolean autorise) {
		Autorise = autorise;
	}
	
	
}

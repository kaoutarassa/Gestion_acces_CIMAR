package com.GestionAccesCIMAR.entities;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.jpa.repository.Temporal;



@Entity
public class Déclaration implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id_declaration;
private String Lieu;
@Temporal
private Date Date;
private Time Heure;
private String Descriptif;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="Code_Personne")
private Personne personne;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="Code_Personnel_CIMAR")
private Personnel_CIMAR personnelCIMAR;


public Déclaration( String lieu, java.util.Date date,
		Time heure, String descriptif) {
	super();
	Lieu = lieu;
	Date = date;
	Heure = heure;
	Descriptif = descriptif;
}
public Déclaration() {
	super();
	// TODO Auto-generated constructor stub
}


public Integer getId_declaration() {
	return id_declaration;
}
public void setId_declaration(Integer id_declaration) {
	this.id_declaration = id_declaration;
}
public String getLieu() {
	return Lieu;
}
public void setLieu(String lieu) {
	Lieu = lieu;
}
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public Time getHeure() {
	return Heure;
}
public void setHeure(Time heure) {
	Heure = heure;
}
public String getDescriptif() {
	return Descriptif;
}
public void setDescriptif(String descriptif) {
	Descriptif = descriptif;
}

}

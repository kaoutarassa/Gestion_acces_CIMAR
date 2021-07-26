package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Passation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Passassion;
	private Date Date;
	private Time heure;
	private String Observation ;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Soutraitant")
	private Soutraitant soutraitant;
public Passation(java.util.Date date, Time heure, String observation) {
	super();
	Date = date;
	this.heure = heure;
	Observation = observation;
}
public Passation() {
	super();
	// TODO Auto-generated constructor stub
}
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public Time getHeure() {
	return heure;
}
public void setHeure(Time heure) {
	this.heure = heure;
}
public String getObservation() {
	return Observation;
}
public void setObservation(String observation) {
	Observation = observation;
}

}

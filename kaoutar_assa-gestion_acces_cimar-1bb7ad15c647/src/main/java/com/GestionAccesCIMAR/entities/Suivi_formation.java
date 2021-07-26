package com.GestionAccesCIMAR.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Suivi_formation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_SuiviFormation;
	private Date Date;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Suivi_formation")
	private Formation_basique formation;
	public Suivi_formation(java.util.Date date) {
		super();
		Date = date;
	}

	public int getId_SuiviFormation() {
		return id_SuiviFormation;
	}

	public void setId_SuiviFormation(int id_SuiviFormation) {
		this.id_SuiviFormation = id_SuiviFormation;
	}

	public Formation_basique getFormation() {
		return formation;
	}

	public void setFormation(Formation_basique formation) {
		this.formation = formation;
	}

	public Suivi_formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}
	
	

}

package com.GestionAccesCIMAR.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="typebadge")
public class TypeBadge implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Type_Badge;
	private boolean Badge_Visiteurs;
	private boolean Badge_Permanent;
	private boolean Badge_Provisoire;
	@OneToMany(mappedBy="typebadge",fetch=FetchType.LAZY)
	Set<Badge> Badges =new HashSet<>();
	public TypeBadge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeBadge(boolean badge_Visiteurs, boolean badge_Permanent,
			boolean badge_Provisoire) {
		super();
		Badge_Visiteurs = badge_Visiteurs;
		Badge_Permanent = badge_Permanent;
		Badge_Provisoire = badge_Provisoire;
	}
	public int getId_Type_Badge() {
		return id_Type_Badge;
	}
	public void setId_Type_Badge(int id_Type_Badge) {
		this.id_Type_Badge = id_Type_Badge;
	}
	public boolean isBadge_Visiteurs() {
		return Badge_Visiteurs;
	}
	public void setBadge_Visiteurs(boolean badge_Visiteurs) {
		Badge_Visiteurs = badge_Visiteurs;
	}
	public boolean isBadge_Permanent() {
		return Badge_Permanent;
	}
	public void setBadge_Permanent(boolean badge_Permanent) {
		Badge_Permanent = badge_Permanent;
	}
	public boolean isBadge_Provisoire() {
		return Badge_Provisoire;
	}
	public void setBadge_Provisoire(boolean badge_Provisoire) {
		Badge_Provisoire = badge_Provisoire;
	}
	public Set<Badge> getBadges() {
		return Badges;
	}
	public void setBadges(Set<Badge> badges) {
		Badges = badges;
	}
	
	
}

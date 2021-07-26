package com.GestionAccesCIMAR;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GestionAccesCIMAR.dao.BadgeRepository;
import com.GestionAccesCIMAR.dao.Categorie_SoutraitantRepository;
import com.GestionAccesCIMAR.dao.Catégorie_CIMAR_Repository;
import com.GestionAccesCIMAR.dao.DéclarationRepository;
import com.GestionAccesCIMAR.dao.Formation_basiqueRepository;
import com.GestionAccesCIMAR.dao.PassationRepository;
import com.GestionAccesCIMAR.dao.PersonneRepository;
import com.GestionAccesCIMAR.dao.Personnel_CIMAR_Repository;
import com.GestionAccesCIMAR.dao.Suivi_FormationRepository;
import com.GestionAccesCIMAR.dao.Type_BadgeRepository;
import com.GestionAccesCIMAR.entities.Badge;
import com.GestionAccesCIMAR.entities.Categorie_Soutraitant;
import com.GestionAccesCIMAR.entities.Catégorie_CIMAR;
import com.GestionAccesCIMAR.entities.Chauffeurs;
import com.GestionAccesCIMAR.entities.Déclaration;
import com.GestionAccesCIMAR.entities.Formation_basique;
import com.GestionAccesCIMAR.entities.Passassion;
import com.GestionAccesCIMAR.entities.Passation;
import com.GestionAccesCIMAR.entities.Personne;
import com.GestionAccesCIMAR.entities.Personnel_CIMAR;
import com.GestionAccesCIMAR.entities.Soutraitant;
import com.GestionAccesCIMAR.entities.Stagiaire;
import com.GestionAccesCIMAR.entities.Suivi_formation;
import com.GestionAccesCIMAR.entities.TypeBadge;
import com.GestionAccesCIMAR.entities.Visiteurs;


@SpringBootApplication
public class GestionAccesCimarApplication implements CommandLineRunner{
@Autowired
private PersonneRepository personneRepositry;
@Autowired
private BadgeRepository BadgeRepositry;
@Autowired
private Catégorie_CIMAR_Repository Catégorie_CIMAR_Repositry;
@Autowired
private Categorie_SoutraitantRepository Caategori_SoutraitantRepositry;
@Autowired
private DéclarationRepository DéclarationRepositry;
@Autowired
private Formation_basiqueRepository FormationBasiqueRepositry;
@Autowired
private PassationRepository passationRepositry;
@Autowired
private Personnel_CIMAR_Repository Personnel_CIMAR_Repositry;
@Autowired
private Suivi_FormationRepository Suivi_Formation_Repositry;
@Autowired
private Type_BadgeRepository Type_Badge_Repositry;


	public static void main(String[] args) {
		SpringApplication.run(GestionAccesCimarApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyy"); 
			Badge b1= BadgeRepositry.save(new Badge());
			TypeBadge tb1=Type_Badge_Repositry.save(new TypeBadge(b1, null, null));
			Catégorie_CIMAR cc1=Catégorie_CIMAR_Repositry.save(new Catégorie_CIMAR(true,false));
			Categorie_Soutraitant cs1= Caategori_SoutraitantRepositry.save(new Categorie_Soutraitant(null, "regie", null, null, null));
			Déclaration d1 = DéclarationRepositry.save(new Déclaration("AGADIR", new Date(), new java.sql.Time(00, 25, 05), "bruit bizzare"));
			Formation_basique f1 =FormationBasiqueRepositry.save(new Formation_basique());
			Passation pas1 =passationRepositry.save(new Passation(new Date(), new java.sql.Time(20, 00, 00), "le camion c1 est interdit à entrer"));
			Suivi_formation sf1 =Suivi_Formation_Repositry.save(new Suivi_formation(new Date()));
			
			   Personnel_CIMAR pc1 = Personnel_CIMAR_Repositry.save(new Personnel_CIMAR("j22", "moh", "ali"));
			   Personne p2 =personneRepositry.save(new Soutraitant("kaoutar", "kaoutar", pc1, cs1, null, b1, d1, f1, "065846999", true)); 
			Personne p1=personneRepositry.save(new Chauffeurs("leila", "lili", pc1, p2, pas1, b1, d1, f1, "jkki21548", true));
		    Personne p3 = personneRepositry.save(new Visiteurs("j888", "leila", "lili","kiki"));
		
	}

	
}
  
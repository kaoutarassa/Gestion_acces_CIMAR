package com.GestionAccesCIMAR.Service;

import com.GestionAccesCIMAR.entities.Passation;
import com.GestionAccesCIMAR.entities.Personne;
import com.GestionAccesCIMAR.entities.Personnel_CIMAR;

public interface IGestionAccesCIMARService {
	public Personne ConsulterPersonne(String codePersonne);
	public Personnel_CIMAR ConsulterPersonnel(String codePersonnel);
	public Passation ConsulterPassation(String codePassation);
	

}

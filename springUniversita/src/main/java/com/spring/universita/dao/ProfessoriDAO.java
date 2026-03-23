package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.spring.universita.entity.Professore;
;
public class ProfessoriDAO {
	
	private Map<Integer, Professore> professori = new HashMap<Integer, Professore>();
	
	// inserimento professore
	public boolean inserisci(Professore professore) {
		if (professori.containsKey(professore.getId())){
			return false;
		}
		professori.put(professore.getId(), professore);
		return true;
	}
	
	// cerca professore per id
	public Professore cercaPerId(int id) {
		return professori.get(id);
	}
	
	//visualizza tutti i professori 
	public ArrayList<Professore> visualizzaProfessori(){
		return new ArrayList<Professore>(professori.values());
	}
	
	// cancella professore
	public boolean cancella( int id ) {
		if (professori.containsKey(id)) {
			professori.remove(id);
			return true;
		}
		return false;
	}
	
	public Professore modificaMateria(int id, String nuovaMateria) {
		Professore professore = professori.get(id);
		professore.setMateria(nuovaMateria);
		return professore; 
	}
}

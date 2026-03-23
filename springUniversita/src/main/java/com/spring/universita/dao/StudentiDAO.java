package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.universita.entity.Studente;

@Repository
public class StudentiDAO {
	
	Map<Integer, Studente> studenti = new HashMap<Integer, Studente>();
	
	// inserisci studenti
	public boolean inserisciStudente(Studente studente) {
		if(studenti.containsKey(studente.getMatricola())) {
			return false;
		}
		studenti.put(studente.getMatricola(), studente);
		return true;
	}
	
	// cerca studente per matricola
	public Studente cercaPerMatricola(int matricola) {
		return studenti.get(matricola);
	}
	
	// visualizza tutti gli studenti
	public ArrayList<Studente> visualizzaStudenti(){
		return new ArrayList<Studente>(studenti.values());
	}
	
	// cancella uno studente
	public boolean cancellaStudente(int matricola) {
		if (studenti.containsKey(matricola)) {
			studenti.remove(matricola);
			return true;
		}
		return false;
	}
	
	// modifica indirizzo studente
	public Studente modificaIndirizzo(int matricola, String indirizzoNuovo) {
		Studente studente = studenti.get(matricola);
		studente.setIndirizzo(indirizzoNuovo);
		return studente;
	}
}

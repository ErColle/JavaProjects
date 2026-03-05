package com.spring.utenti.service;

import java.util.List;

import com.spring.utenti.dao.DAOUtenteMappa;
import com.spring.utenti.entity.Utente;

public class UtenteService {
	
	private DAOUtenteMappa dao = new DAOUtenteMappa(); 
	
	public boolean registra(Utente utente) {
		dao.insert(utente);
		return true;
	}
	
	public Utente cercaPerId(int id ) {
		return dao.selectById(id);
	}
	
	public Utente eliminaUtente(int id ) {
		return dao.delete(id);
	}
	
	public List<Utente> listaUtenti(){
		return dao.selectAll();
	}
	
	public List<Utente> listaUtentiOrd() {
	    List<Utente> lista = dao.selectAll();
	    lista.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
	    return lista;
	}
	
	public List<String> listaNomi(){
		List<Utente> utenti = dao.selectAll();
		List<String> res = utenti.stream()
				.map( u -> u.getNome())
				.toList();
		
		return res;
		
	}
}

package com.spring.utenti.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utenti.entity.Utente;
import com.spring.utenti.service.UtenteService;

@RestController
@RequestMapping(path="/utenti")
public class UtenteController {
	
	private UtenteService service = new UtenteService();
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody Utente utente) {
		return service.registra(utente);
	}
	
	@GetMapping(path="/cerca/{idUtente}", produces = "application/json")
	public Utente cercaPerId(@PathVariable int idUtente) {
		return service.cercaPerId(idUtente);
	}
	
	@GetMapping(path="/elimina/{idUtente}", produces = "application/json")
	public Utente eliminaPerId(@PathVariable int idUtente){
		return service.eliminaUtente(idUtente);
	}
	
	@GetMapping(path="/tutti", produces = "application/json")
	public List<Utente> tutti(){
		return service.listaUtenti();
	}
	
	@GetMapping(path="/tutti/ordinati", produces = "application/json")
	public List<Utente> tuttiOrdinati(){
		return service.listaUtentiOrd();
	}
	
	@GetMapping(path="/nomi", produces = "application/json")
	public List<String> nomi(){
		return service.listaNomi();
	}
}

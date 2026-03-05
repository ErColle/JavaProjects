package com.spring.utenti.entity;

public class Utente {
	private int idUtente;
	private String nome, cognome, email, telefono;
	
	public Utente() {
		
	}
	
	public Utente(int idUtente, String nome, String cognome, String email, String telefono) {
		this.idUtente = idUtente;
		this.nome = nome; 
		this.cognome = cognome; 
		this.email = email;
		this.telefono = telefono;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}

package com.spring.reprodotti.entity;

public class Prodotto {
	private int id; 
	private String marca;
	private String modello; 
	private String descrizione; 
	private int prezzoConsigliato; 
	private int prezzoMax; 
	private int quantita; // pezzi disponibili
	private String categoria;
	
	public Prodotto(int id, String marca, String modello, String descrizione, int prezzoConsigliato, int prezzoMax,
			int quantita, String categoria) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzoConsigliato = prezzoConsigliato;
		this.prezzoMax = prezzoMax;
		this.quantita = quantita;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzoConsigliato() {
		return prezzoConsigliato;
	}

	public void setPrezzoConsigliato(int prezzoConsigliato) {
		this.prezzoConsigliato = prezzoConsigliato;
	}

	public int getPrezzoMax() {
		return prezzoMax;
	}

	public void setPrezzoMax(int prezzoMax) {
		this.prezzoMax = prezzoMax;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}

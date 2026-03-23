package com.spring.universita.entity;

public class CognomeAnnoIscrizioneDTO {
	
	private String cognome;
	private int annoIscrizione;
	
	public CognomeAnnoIscrizioneDTO(String cognome, int annoIscrizione) {
		super();
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public void setAnnoIscrizione(int annoIscrizione) {
		this.annoIscrizione = annoIscrizione;
	}
	

}

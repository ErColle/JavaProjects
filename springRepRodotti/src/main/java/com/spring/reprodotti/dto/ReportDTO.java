package com.spring.reprodotti.dto;

import java.util.List;
import java.util.Map;

public class ReportDTO {
    // Elenco delle descrizioni di tutti i prodotti
    private List<String> descrizioni;
 
    // Numero di pezzi totali immagazzinati (somma delle quantità)
    private int totalePezzi;

    // Numero totale dei prodotti NON disponibili (quantità == 0)
    private int totaleNonDisponibili;
 
    // Media di tutti i prezzi consigliati
    private double mediaPrezzi;
 
    // Elenco dei modelli dei prodotti NON disponibili
    private List<String> modelliNonDisponibili;
 
    // [OPZIONALE] Mappa: categoria -> lista di ID prodotti
    private Map<String, List<Integer>> idPerCategoria;

	public ReportDTO(List<String> descrizioni, int totalePezzi, int totaleNonDisponibili, double mediaPrezzi,
			List<String> modelliNonDisponibili, Map<String, List<Integer>> idPerCategoria) {
		super();
		this.descrizioni = descrizioni;
		this.totalePezzi = totalePezzi;
		this.totaleNonDisponibili = totaleNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
		this.modelliNonDisponibili = modelliNonDisponibili;
		this.idPerCategoria = idPerCategoria;
	}

	public List<String> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<String> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public int getTotalePezzi() {
		return totalePezzi;
	}

	public void setTotalePezzi(int totalePezzi) {
		this.totalePezzi = totalePezzi;
	}

	public int getTotaleNonDisponibili() {
		return totaleNonDisponibili;
	}

	public void setTotaleNonDisponibili(int totaleNonDisponibili) {
		this.totaleNonDisponibili = totaleNonDisponibili;
	}

	public double getMediaPrezzi() {
		return mediaPrezzi;
	}

	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}

	public List<String> getModelliNonDisponibili() {
		return modelliNonDisponibili;
	}

	public void setModelliNonDisponibili(List<String> modelliNonDisponibili) {
		this.modelliNonDisponibili = modelliNonDisponibili;
	}

	public Map<String, List<Integer>> getIdPerCategoria() {
		return idPerCategoria;
	}

	public void setIdPerCategoria(Map<String, List<Integer>> idPerCategoria) {
		this.idPerCategoria = idPerCategoria;
	}
    
	
}

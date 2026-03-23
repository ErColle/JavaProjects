package com.spring.universita.services;

import java.util.Comparator;
import java.util.List;

import com.spring.universita.dao.StudentiDAO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.CognomeAnnoIscrizioneDTO;
import com.spring.universita.entity.CognomeAnnoNascitaDTO;
import com.spring.universita.entity.Studente;
import com.spring.universita.mapper.Mapper;

public class StudentiServices {
	
	private StudentiDAO dao = new StudentiDAO();
	
	public boolean inserisci(StudenteDTO dto) {
		Studente studente = Mapper.daStudenteDTOaStudente(dto);
		return dao.inserisciStudente(studente);
	}
	
	public StudenteDTO cercaPerId(int matricola ) {
		Studente studente = dao.cercaPerMatricola(matricola);
		if (studente != null ) {
			return Mapper.daStudenteaStudenteDTO(studente);
		}
		return null; 
	}
	
	public List<StudenteDTO> visualizzaStudenti(){
		return dao.visualizzaStudenti()
				.stream()
				.map(s -> Mapper.daStudenteaStudenteDTO(s))
				.toList();
	}
	
	public boolean cancella(int matricola ) {
		return dao.cancellaStudente(matricola);
	}
	
	public StudenteDTO modificaIndirizzo(int matricola, String nuovoIndirizzo) {
		Studente studente = dao.modificaIndirizzo(matricola, nuovoIndirizzo);
		return Mapper.daStudenteaStudenteDTO(studente);
	}
	
	//metodi avanzati
	
	public List<String> visualizzaNomiStudenti(){
		return dao.visualizzaStudenti()
				.stream()
				.map( s -> s.getNome())
				.toList();
	}
	
	public CognomeAnnoNascitaDTO cognomeAnnoNascitaPiuGiovane() {
		return dao.visualizzaStudenti()
				.stream()
				.map( s -> new CognomeAnnoNascitaDTO(s.getCognome(), s.getAnnoNascita())) // trasformo ogni elemento s in un dto 
				.max(Comparator.comparingInt(dto -> dto.getAnnoNascita())) // interfaccia comparator dove estrae per annoNascita max 
				.orElse(null); // se dao.visualizza studenti = null ritorna null
	}
	
	public CognomeAnnoIscrizioneDTO cognomeIscrizioneIscrittoPiuTempo() {
		return dao.visualizzaStudenti()
				.stream()
				.map( s -> new CognomeAnnoIscrizioneDTO(s.getCognome(), s.getAnnoImmatricolazione()))
				.min(Comparator.comparingInt(dto -> dto.getAnnoIscrizione()))
				.orElse(null);
	}
}

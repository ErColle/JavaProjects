package com.spring.universita.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.universita.dao.ProfessoriDAO;
import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.mapper.Mapper;

@Service
public class ProfessoriServices {
	
	ProfessoriDAO dao = new ProfessoriDAO();
	
	public boolean inserisci(ProfessoreDTO dto ) {
		Professore professore = Mapper.daProfessoreDTOaProfessore(dto);
		return dao.inserisci(professore);		
	}
	
	public ProfessoreDTO cercaPerId(int id) {
		Professore professore = dao.cercaPerId(id);
		if ( professore != null) {
			return Mapper.daProfessoreaProfessoreDTO(professore);
		}
		return null; 
	}
	
	public List<ProfessoreDTO> visualizzaProfessori(){
		return dao.visualizzaProfessori()
				.stream()
				.map( p -> Mapper.daProfessoreaProfessoreDTO(p))
				.toList();
	}
	
	public boolean cancella(int id ) {
		return dao.cancella(id);
	}
	
	public ProfessoreDTO modificaMateria(int id, String nuovaMateria ) {
		Professore professore = dao.modificaMateria(id, nuovaMateria);
		return Mapper.daProfessoreaProfessoreDTO(professore);
	}
	
	// metodi avanzati
	
	// visualizza tutti professori materia specifica
	public List<ProfessoreDTO> visualizzaProfessoriMateria(String materia){
		return  dao.visualizzaProfessori()
				.stream()
				.filter( p -> p.getMateria().equalsIgnoreCase(materia))
				.map( p -> Mapper.daProfessoreaProfessoreDTO(p))
				.toList();
	}
	
	// visualizza professori ordinati per cognome
	public List<ProfessoreDTO> visualizzaCognomeOrdinati(){
		return dao.visualizzaProfessori()
				.stream()
				.sorted( ((p1, p2 ) -> p1.getCognome().compareTo(p2.getCognome())) )
				.map( p -> Mapper.daProfessoreaProfessoreDTO(p))
				.toList();
	}

}

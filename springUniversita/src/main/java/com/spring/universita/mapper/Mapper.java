package com.spring.universita.mapper;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.entity.Studente;

public class Mapper {

	public static StudenteDTO daStudenteaStudenteDTO(Studente studente ) {
		return new StudenteDTO(studente.getMatricola(), studente.getNome(), studente.getCognome(),studente.getIndirizzo(), studente.getAnnoNascita(), studente.getAnnoImmatricolazione());
	}
	
	public static Studente daStudenteDTOaStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getIndirizzo(), dto.getAnnoNascita(), dto.getAnnoImmatricolazione());
	}
	
	public static Professore daProfessoreDTOaProfessore(ProfessoreDTO dto) {
		return new Professore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getMateria());
	}
	
	public static ProfessoreDTO daProfessoreaProfessoreDTO(Professore professore) {
		return new ProfessoreDTO(professore.getId(), professore.getNome(), professore.getCognome(), professore.getMateria());
	}
	
}

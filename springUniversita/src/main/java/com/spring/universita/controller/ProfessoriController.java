package com.spring.universita.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.services.ProfessoriServices;

@RestController
@RequestMapping(path="/professori")
public class ProfessoriController {

	@Autowired
	private ProfessoriServices services;
	
	@PostMapping(path="/registra", consumes="application/json")
	public boolean registra(@RequestBody ProfessoreDTO dto) {
		return services.inserisci(dto);
	}
	
	@GetMapping(path="/{id}", produces="application/json")
	public ProfessoreDTO cercaPerId(@PathVariable int id ) {
		return services.cercaPerId(id);
	}
	
	@PostMapping(path="", produces="application/json")
	public List<ProfessoreDTO> visualizzaProfessori() {
		return services.visualizzaProfessori();
	}
	
	@DeleteMapping(path="/{id}")
		public boolean elimina(int id){
			return services.cancella(id);
		}

	@PatchMapping(path="/{id}/modificaMateria", produces="application/json")
	public ProfessoreDTO modificaMateria(int id, String nuovaMateria) {
		return services.modificaMateria(id, nuovaMateria);
	}
	
	@GetMapping(path="/filtraPerMateria/{materia}", produces = "application/json")
	public List<ProfessoreDTO> insegnaMateria(@PathVariable String materia){
		return services.visualizzaProfessoriMateria(materia);
	}
	
	@GetMapping(path="/ordinaCognomi", produces = "application/json")
	public List<ProfessoreDTO> ordinaCognomi(){
		return services.visualizzaCognomeOrdinati();
	}
	
	@GetMapping(path="/materie", produces = "application/json")
	public List<ProfessoreDTO> materieInsegnate(@PathVariable String materia){
		return services.visualizzaProfessoriMateria(materia);
	}
	
	
}

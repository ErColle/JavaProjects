package com.spring.prodotti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.prodotti.dto.ErroreDTO;
import com.spring.prodotti.dto.ProdottoDTO;
import com.spring.prodotti.service.ProdottoService;

@RestController
@RequestMapping(path="/prodotti")
public class ProdottoController {
	
	@Autowired
	private ProdottoService service;
	
	@PostMapping(path = "/carica", consumes = "application/json")
	public void carica(@RequestBody ProdottoDTO dto) {
		service.carica(dto);
	}
	
	@PostMapping(path="/cerca/{id}", produces="application/json")
	public ProdottoDTO cercaPerId(@PathVariable int id) {
		return service.cercaPerId(id);
	}
	
	//-------gestione degli errori
	public ResponseEntity<ErroreDTO> gestoreErrori (RuntimeException ex){
		ErroreDTO dto = new ErroreDTO(ex.getMessage());
		return new ResponseEntity<ErroreDTO>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

package com.spring.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calcolo")
public class CalcolatriceController {
	
	public CalcolatriceController() {
		System.out.println("spring sta costruendo CalcolatriceController...");
	}
	
	@GetMapping(path="/somma")
	public int somma(int a, int b){
		return a + b;
	}
	
	@GetMapping(path="/sottrazione")
	public int sottrazione(int a, int b){
		return a - b;
	}
	
	@GetMapping(path="/moltiplicazione")
	public String moltiplicazione(int a, int b){
		return a * b + " il calcolo e' renale!";
	}

	@GetMapping(path="/divisione")
	public String divisione(int a, int b){
		return a / b + " il calcolo e' renale!";
	}
	
}

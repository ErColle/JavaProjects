package com.spring.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // indica a spring che deve instanziare e gestire questa classe IoC
@RequestMapping(path="/saluti") // mappa la classe ad un URI
public class HelloController {
	
	public HelloController() {
		System.out.println("spring sta costruendo HelloController...");
	}
	

	@GetMapping(path ="/generici") // saluti/generici
	public String helloWorld() {
		return "Odio i froci";
	}
	
	@GetMapping(path="/pers")
		public String hello(String nome) { //saluti/pers?nome=luca
			return "Ciao " + nome;
	}
}
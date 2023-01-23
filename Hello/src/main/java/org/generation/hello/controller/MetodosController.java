package org.generation.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informar que é um Controller 
@RequestMapping("/Metodos") //informar o endereço da web

public class MetodosController {
	String ment [] = {"mentalidade","Comunicação","Persistencia","Trabalho em equipe","orientação ao futuro",
			"Proatividade","orientação ao detalhes"},saida="";
	@GetMapping
	public String Metodos() {
		for(String metodos : ment) {
			saida += metodos+"<br>";
		}
	     return saida;
	}

}

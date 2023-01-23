package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Objetivos")
public class ObjetivosController {
	 @GetMapping 
	 public String Persistencia() {
		 return "A Persistencia";
		 
	 }

}

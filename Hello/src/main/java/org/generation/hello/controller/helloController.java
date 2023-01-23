package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informar que é um controller
@RequestMapping("/helloworld")//informar o endereço da web

public class helloController {
	  @GetMapping //pega as informaçao do metodo e exibe 
	  public String hello() {
		  return "Hello World! Seja, bem vindos ao Spring!";
	  }

}




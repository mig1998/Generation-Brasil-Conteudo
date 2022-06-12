package com.generation.skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/atividade")



public class skillController {
	@GetMapping("habilidades")
			public String habilidades() {
		return	"mentalidades: Persistencia, Mentalidade de Crescimento"
				+ "habilidades: Comunicação, Trabalho em equipe, atenção aos detalhes e proatividade ";
		
	}
	
	@GetMapping("objetivos")
	public String objetivos() {
		return	"aprender mais com o projeto integrador, relacionamento de banco de dados"
				+ "e utilizar melhor a ferramenta Spring Tools";

}


}

package com.generation.lojagames.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Cliente;
import com.generation.lojagames.model.ClienteLogin;
import com.generation.lojagames.repository.ClienteRepository;
import com.generation.lojagames.service.ClienteService;

@RestController

@RequestMapping("/cliente")

@CrossOrigin(origins = "*",allowedHeaders = "*")

public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getAllCliente(){
		return ResponseEntity.ok(clienteRepository.findAll());
	}
	
	
	@PostMapping("/logar")
	public ResponseEntity<ClienteLogin> loginClient(@RequestBody Optional<ClienteLogin> clienteLogin){
		return clienteService.loginCliente(clienteLogin)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	

	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadClient(@Valid @RequestBody Cliente cliente){
	
	return clienteService.cadastrarCliente(cliente)
		.map(resp-> ResponseEntity.status(HttpStatus.CREATED).body(resp))
		.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}


	@PutMapping("/atualizar")
	
	public ResponseEntity<Cliente> updateCliente(@Valid @RequestBody Cliente cliente){
		
		return clienteService.atualizarUsuario(cliente)
				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		
		
	}
	
	
	
	
	
}
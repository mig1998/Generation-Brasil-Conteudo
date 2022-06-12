package com.generation.lojagames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generation.lojagames.model.Cliente;
import com.generation.lojagames.model.ClienteLogin;
import com.generation.lojagames.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Optional<Cliente> cadastrarCliente(Cliente cliente){
		if(clienteRepository.findByUser(cliente.getUser()).isPresent())
		return Optional.empty();
		
		cliente.setSenha(criptografarSenha(cliente.getSenha()));
		
		return Optional.of(clienteRepository.save(cliente));
		
	}
	

	
	public Optional<ClienteLogin> loginCliente(Optional<ClienteLogin> clienteLogin){
		
		Optional<Cliente> cliente=clienteRepository.findByUser(clienteLogin.get().getUser());
		
		
		if(cliente.isPresent()) {
			if(compararSenha(clienteLogin.get().getSenha(),cliente.get().getSenha())) {
				
				clienteLogin.get().setId(cliente.get().getId());
				clienteLogin.get().setNome(cliente.get().getNome());
				clienteLogin.get().setToken(generateToken(clienteLogin.get().getUser(),clienteLogin.get().getSenha()));
				clienteLogin.get().setSenha(cliente.get().getSenha());
				return clienteLogin;
			}
		}
		
		return Optional.empty();
	}
	
public Optional<Cliente> atualizarUsuario(Cliente cliente) {
		
		if(clienteRepository.findById(cliente.getId()).isPresent()) {
			
			cliente.setSenha(criptografarSenha(cliente.getSenha()));
			return Optional.ofNullable(clienteRepository.save(cliente));
			
		}
		
		return Optional.empty();
	
	}	

	
	
	private String criptografarSenha(String senha) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		return encoder.encode(senha);
	}
	
	
	
	private boolean compararSenha(String senhaDigitada,String senhaUser) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		return encoder.matches(senhaDigitada, senhaUser);
	}

	
	private String generateToken(String usuario,String senha) {
		
		String token=usuario+":"+senha;
		byte[] token64=Base64.encodeBase64(token.getBytes(Charset.forName("US-ASCII")));
		return "Basic "+new String(token64);
	}


}

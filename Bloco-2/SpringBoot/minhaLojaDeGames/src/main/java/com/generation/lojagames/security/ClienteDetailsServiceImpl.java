package com.generation.lojagames.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.lojagames.model.Cliente;
import com.generation.lojagames.repository.ClienteRepository;

@Service
public class ClienteDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Cliente> cliente = clienteRepository.findByUser(userName);
		  
		cliente.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

		return cliente.map(ClienteDetailsImpl::new).get();
	}
	
}

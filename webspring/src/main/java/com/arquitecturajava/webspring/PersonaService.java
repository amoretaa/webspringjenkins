package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public void add(Persona persona) {
		personaRepository.add(persona);
	}

	public List<Persona> buscarTodos() {
		return personaRepository.buscarTodos();
	}

	
	
}

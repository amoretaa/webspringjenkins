package com.arquitecturajava.webspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonaRepository {

	private List<Persona> personas = new ArrayList<Persona>();
	
	public PersonaRepository () {
		
		personas.add(new Persona("ana"));
	}
	
	public void add(Persona persona) {
		
		personas.add(persona);
	}
	
	public List<Persona> buscarTodos(){
		
		return personas;
	}
}

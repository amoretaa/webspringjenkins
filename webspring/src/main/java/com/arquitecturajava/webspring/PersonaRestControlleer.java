package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arquitecturajava.webspring.dtos.PersonaDTO;
import com.arquitecturajava.webspring.mappers.PersonaMapper;
import com.arquitecturajava.webspring.models.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaRestControlleer {

	@Autowired
	private PersonaService servicio;

	public void add(PersonaDTO personaDTO) {
		servicio.add(PersonaMapper.toBo(personaDTO));
	}

	@GetMapping
	public List<PersonaDTO> buscarTodos() {
		return servicio.buscarTodos().stream().map((p)->new PersonaDTO(p.getNombre())).toList();
	}
	
}

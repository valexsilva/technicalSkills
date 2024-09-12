package com.coyote.technicalSkills.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coyote.technicalSkills.repository.PersonRepository;
import com.coyote.technicalSkills.repository.entities.Person;

@RestController
@RequestMapping("/personas")
public class MemberController {
	
	@Autowired
	private PersonRepository personRepository;

    @GetMapping
    public List<Person> obtenerTodasLasPersonas() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person obtenerPersonaPorId(@PathVariable Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));
    }

    @PostMapping
    public Person crearPersona(@RequestBody Person persona) {
        return personRepository.save(persona);
    }

    @PutMapping("/{id}")
    public Person actualizarPersona(@PathVariable String id, @RequestBody Person personaActualizada) {
        personaActualizada.setPersonId(id);
        return personRepository.save(personaActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        personRepository.deleteById(id);
    }
}


package com.microservice.personmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.personmicroservice.dto.PersonDTO;
import com.microservice.personmicroservice.mapper.PersonMapper;
import com.microservice.personmicroservice.service.PersonServiceImpl;

@RestController
@RequestMapping("person/api")
public class PersonController {

    private final PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @Autowired
    PersonMapper mapper;

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getPersonById(@PathVariable Integer id) {
        return new ResponseEntity<>(personService.findPersonById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePersonById(@PathVariable Integer id) {
        personService.deletePersonById(id);

    }

    @PostMapping
    public ResponseEntity<PersonDTO> savePerson(@RequestBody PersonDTO personDTO) {
        return new ResponseEntity<>(personService.savePerson(personDTO), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getPeople() {
        return ResponseEntity.ok(personService.getAllPeople());
    }

}

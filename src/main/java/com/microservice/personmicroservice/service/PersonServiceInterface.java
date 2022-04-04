package com.microservice.personmicroservice.service;

import java.util.List;

import com.microservice.personmicroservice.dto.PersonDTO;

public interface PersonServiceInterface {

    PersonDTO findPersonById(Integer id);

    PersonDTO savePerson(PersonDTO personDTO);

    void deletePersonById(Integer id);

    List<PersonDTO> getAllPeople();

}

package com.microservice.personmicroservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.microservice.personmicroservice.dto.PersonDTO;
import com.microservice.personmicroservice.mapper.PersonMapper;
import com.microservice.personmicroservice.repository.PersonEntityRepository;

@Service
public class PersonServiceImpl implements PersonServiceInterface {

    private final PersonEntityRepository personEntityRepository;
    private final PersonMapper personMapper;

    public PersonServiceImpl(PersonEntityRepository personEntityRepository, PersonMapper personMapper) {
        this.personEntityRepository = personEntityRepository;
        this.personMapper = personMapper;
    }

    @Override
    public PersonDTO findPersonById(Integer id) {
        return personMapper.toPersonDTO(personEntityRepository.getById(id));
    }

    @Override
    public PersonDTO savePerson(PersonDTO personDTO) {
        return personMapper.toPersonDTO(personEntityRepository.save(personMapper.toPerson(personDTO)));
    }

    @Override
    public void deletePersonById(Integer id) {
        personEntityRepository.deleteById(id);
    }

    @Override
    public List<PersonDTO> getAllPeople() {
        return personEntityRepository.findAll().stream().map(personMapper::toPersonDTO).collect(Collectors.toList());
    }

}

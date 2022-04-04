package com.microservice.personmicroservice.mapper;

import org.mapstruct.Mapper;

import com.microservice.personmicroservice.dto.PersonDTO;
import com.microservice.personmicroservice.entitie.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDTO toPersonDTO(Person person);

    Person toPerson(PersonDTO personDTO);

    Person toPersonUpdate(PersonDTO personDTO);

}
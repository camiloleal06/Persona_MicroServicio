package com.microservice.personmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservice.personmicroservice.entitie.Person;

@Repository
public interface PersonEntityRepository extends JpaRepository<Person, Integer> {
    @Query("SELECT p FROM Person p WHERE p.firstName LIKE %:firstName% AND p.lastName LIKE %:lastName%")
    List<Person> searchByTitleLike(@Param("firstName") String firstName, @Param("lastName") String lastName);
}

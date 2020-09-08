package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import com.manas.learning.springboot.caching.config.CacheTTL;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Slf4j
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @CacheTTL(cacheName="person", ttlMinutes = 5)
    public Person getPerson(long personId){
        log.info("Received request - Service class {} ", personId);
        return personRepository.getPerson(personId);
    }

    @CacheTTL(cacheName="employee", ttlMinutes = 5)
    public Person getEmployee(long employeeId) {
        log.info("Received request - Service class {} ", employeeId);
        return personRepository.getPerson(employeeId);
    }


    @CacheTTL(cacheName="employeeString", ttlMinutes = 5)
    public Person getEmployeeString(String employeeId) {
        log.info("Received request - Service class {} ", employeeId);
        return personRepository.getPerson(1);
    }
}

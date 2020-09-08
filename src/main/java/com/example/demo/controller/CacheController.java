package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CacheController {

    private final PersonService personService;
    private final DepartmentService departmentService;

    @Autowired
    public CacheController(PersonService personService, DepartmentService departmentService) {

        this.personService = personService;
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/person/{personId}")
    public Person getPerson(@PathVariable long personId){
        log.info("Received request with personId {}", personId);
        return personService.getPerson(personId);
    }

    @GetMapping(value = "/employee/{employeeId}")
    public Person getEmployee(@PathVariable long employeeId){
        log.info("Received request with employeeId {}", employeeId);
        return personService.getEmployee(employeeId);
    }

    @GetMapping(value = "/employee-str/{employeeId}")
    public Person getEmployeeString(@PathVariable long employeeId){
        log.info("Received request with employeeId {}", employeeId);
        return personService.getEmployeeString(null);
    }

    @DeleteMapping(value = "/department/{departmentId}")
    public boolean deleteDepartment(@PathVariable long departmentId){
        log.info("Received request with departmentId {}", departmentId);
        return departmentService.deleteDepartment(departmentId);
    }
}

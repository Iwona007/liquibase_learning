package pl.iwona.liquibaselearning.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.iwona.liquibaselearning.dao.Person;
import pl.iwona.liquibaselearning.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getPearson() {
       return personService.getAllPearson();

    }

}

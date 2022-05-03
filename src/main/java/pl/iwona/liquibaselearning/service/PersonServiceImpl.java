package pl.iwona.liquibaselearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.iwona.liquibaselearning.dao.Person;
import pl.iwona.liquibaselearning.repository.PersonRepo;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepo personRepo;

    @Autowired
    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public List<Person> getAllPearson() {
        return personRepo.findAll();
    }
}

package pl.iwona.liquibaselearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.iwona.liquibaselearning.dao.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {


}

package ru.vdovin.learningproject.OOPLearningApp.repositories.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vdovin.learningproject.OOPLearningApp.models.person.Person;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}

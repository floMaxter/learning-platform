package ru.vdovin.learningproject.OOPLearningApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.vdovin.learningproject.OOPLearningApp.models.person.Person;
import ru.vdovin.learningproject.OOPLearningApp.repositories.people.PeopleRepository;
import ru.vdovin.learningproject.OOPLearningApp.security.PersonDetails;

import java.util.Optional;

@Service
public class PersonRegistrationService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PersonRegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public void isUserExists(String username) throws UsernameNotFoundException {
        Optional<Person> person = peopleRepository.findByUsername(username);

        if(person.isPresent())
            throw new UsernameNotFoundException("User already exists!");
    }
}

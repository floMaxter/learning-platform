package ru.vdovin.learningproject.OOPLearningApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.vdovin.learningproject.OOPLearningApp.models.person.Person;
import ru.vdovin.learningproject.OOPLearningApp.repositories.people.PeopleRepository;
import ru.vdovin.learningproject.OOPLearningApp.security.PersonDetails;

import java.util.Optional;

//Сервис для Spring Security
@Service
public class PersonDetailsService implements UserDetailsService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PersonDetailsService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = peopleRepository.findByUsername(username);

        if(!person.isPresent())
            throw new UsernameNotFoundException("User not found!");

        return new PersonDetails(person.get());
    }
}

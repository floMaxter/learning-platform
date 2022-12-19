package ru.vdovin.learningproject.OOPLearningApp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.vdovin.learningproject.OOPLearningApp.models.person.Person;
import ru.vdovin.learningproject.OOPLearningApp.services.PersonRegistrationService;

@Component
public class PersonValidator implements Validator {
    private final PersonRegistrationService personRegistrationService;

    @Autowired
    public PersonValidator(PersonRegistrationService personRegistrationService) {
        this.personRegistrationService = personRegistrationService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        try {
            personRegistrationService.isUserExists(person.getUsername());
        } catch (UsernameNotFoundException ignored) {
            errors.rejectValue("username", "", "Person with that name already exists");
        }
    }
}

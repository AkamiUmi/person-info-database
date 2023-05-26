package com.akamiumi.service;

import com.akamiumi.entity.Person;
import com.akamiumi.model.FindPersonRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.akamiumi.repository.PersonRepository;

import java.util.List;

@Slf4j
@Service
public class PersonServiceImpl implements PersonService{
     private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @Override
    public List<Person>  findPersonByParam(FindPersonRequest personRequest) {
        List<Person> res = personRepository.findPersonByParam(
                personRequest.getFio(),
                personRequest.getPinfl(),
                personRequest.getPasSeries(),
                personRequest.getPasNumber(),
                personRequest.getDocument() != null ? personRequest.getDocument().name() : null);
        return res;
    }
    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

}

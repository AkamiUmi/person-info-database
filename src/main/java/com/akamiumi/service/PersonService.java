package com.akamiumi.service;

import com.akamiumi.entity.Person;
import com.akamiumi.model.FindPersonRequest;

import java.util.List;

public interface PersonService {
    List<Person> findPersonByParam(FindPersonRequest personRequest);
    Person savePerson(Person person);
}

package com.akamiumi.controller;

import com.akamiumi.model.FindPersonRequest;
import com.akamiumi.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.akamiumi.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/person")
    public ResponseEntity<List<Person>> findPersonByParam(@RequestBody FindPersonRequest model) {
        return ResponseEntity.ok(personService.findPersonByParam(model));
    }
    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person newPerson) {

        Person savedPerson = personService.savePerson(newPerson);

        return ResponseEntity.ok(savedPerson);
    }
}

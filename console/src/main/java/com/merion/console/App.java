package com.merion.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.merion.core.Person;
import com.merion.service.PersonService;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setFirstName("Jon");
        person.setLastName("Smith");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person fromJson = personService.parse(json);
        System.out.println(fromJson);
    }
}

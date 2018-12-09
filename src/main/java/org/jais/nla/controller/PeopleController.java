package org.jais.nla.controller;

import org.jais.nla.domain.model.Person;
import org.jais.nla.domain.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleController {
    @Autowired
    private LibraryService libraryService;

    @RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
    public List<Person> findAll() {
        return libraryService.getAllPeople();
    }
// TODO check if this is required
//    @RequestMapping(value = "/{personId}", method = RequestMethod.GET, produces = { "application/json" })
//    public List<Book> getBooksLentByPerson(@PathVariable("personId") Integer personId) {
//        return libraryService.getAllBooksLentByPerson(personId);
//    }
}

package org.jais.nla.controller;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
@RestController
public class PersonController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping(value = "/person/{id}/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(@PathVariable("id")final Integer personId) {
        return libraryService.getBooksLentToPerson(personId);

    }
}
package org.jais.nla.domain.service;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;

import java.util.List;

/**
 * Created by vandanajaiswal on 9/12/2018.
 */
public interface LibraryService {
    List<Person> getAllPeople();

    List<Book> getAllBooks();

    List<Book> getAllBooksLentToPerson(Person person);

}

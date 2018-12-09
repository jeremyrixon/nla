package org.jais.nla.domain.service;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.jais.nla.domain.repository.BookRepository;
import org.jais.nla.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getBooksLentToPerson(final Integer personId) {
        final Optional<Person> personOptional = personRepository.findById(personId);
        if(!personOptional.isPresent()){
            return Collections.EMPTY_LIST;
        }
        return personOptional.get().getBooks();
    }
}

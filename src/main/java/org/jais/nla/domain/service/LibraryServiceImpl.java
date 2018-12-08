package org.jais.nla.domain.service;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.jais.nla.domain.repository.BookRepository;
import org.jais.nla.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPeople() {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getAllBooksLentToPerson(final Person person) {
        return null;
    }
}

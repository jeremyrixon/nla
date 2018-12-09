package org.jais.nla.domain.service;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.jais.nla.domain.repository.BookRepository;
import org.jais.nla.domain.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

/**
 * Created by vandanajaiswal on 10/12/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryServiceImplTest {
    @Mock
    private PersonRepository personRepository;

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private LibraryServiceImpl service;

    @Test
    public void shouldFindAllPersonsWhenGetPersons() {
        given(personRepository.findAll()).willReturn(new ArrayList<Person>());
        service.getPersons();
        verify(personRepository).findAll();
    }

    @Test
    public void shouldFindAllBooksWhenGetAllBooks() {
        given(bookRepository.findAll()).willReturn(new ArrayList<Book>());
        service.getAllBooks();
        verify(bookRepository).findAll();
    }

    @Test
    public void shouldReturnBooksLentToPersonWhenFindById() {
        final Person personWithBooks = new Person();
        personWithBooks.setFirstName("Test");
        final Book book = new Book("title", "author", "isbn");
        personWithBooks.setBooks(Arrays.asList(book));
        given(personRepository.findById(1)).willReturn(Optional.empty(), Optional.of(personWithBooks));
        //No books returned
        List<Book> booksLent = service.getBooksLentToPerson(1);
        assertThat(booksLent.size()).isEqualTo(0);
        //1 book returned
        booksLent = service.getBooksLentToPerson(1);
        assertThat(booksLent.size()).isEqualTo(1);
        assertThat(booksLent.get(0).getIsbn()).isEqualTo("isbn");

    }
}
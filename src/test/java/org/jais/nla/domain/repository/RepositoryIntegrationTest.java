package org.jais.nla.domain.repository;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

/**
 * Created by vandanajaiswal on 10/12/2018.
 */
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class RepositoryIntegrationTest {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void shouldReturnAllPersonsWhenFindAll() {
        final List<Person> personList = personRepository.findAll();
        assertThat(personList.size()).isEqualTo(7);
        assertThat(personList.get(6).getFirstName()).isEqualTo("Nikhil");
        assertThat(personList.get(6).getLastName()).isEqualTo("Kohl");
    }

    @Test
    public void shouldReturnAllBooksWhenFindAll() {
        final List<Book> bookList = bookRepository.findAll();
        assertThat(bookList.size()).isEqualTo(11);
        assertThat(bookList.get(5).getAuthor()).isEqualTo("Richard Bach");
        assertThat(bookList.get(5).getTitle()).isEqualTo("Jonathan Livingston Seagull");
    }

    @Test
    public void shouldReturnBooksLentToPersonWhenFindById() {
        final Optional<Person> personOptional = personRepository.findById(3);
        assertThat(personOptional.get().getBooks().size()).isEqualTo(5);
        assertThat(personOptional.get().getBooks().get(4).getAuthor()).isEqualTo("Eric Elliott");
        assertThat(personOptional.get().getBooks().get(4).getTitle()).isEqualTo("Programming JavaScript Applications");
    }
}
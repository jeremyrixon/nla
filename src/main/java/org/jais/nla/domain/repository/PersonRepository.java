package org.jais.nla.domain.repository;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Book> findByPersonId(long id);
}

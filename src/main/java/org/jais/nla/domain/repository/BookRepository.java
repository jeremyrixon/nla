package org.jais.nla.domain.repository;

import org.jais.nla.domain.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}

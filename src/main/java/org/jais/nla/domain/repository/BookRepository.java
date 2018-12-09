package org.jais.nla.domain.repository;

import org.jais.nla.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
        List<Book> findAll();
}

package org.jais.nla.domain.repository;

import org.jais.nla.domain.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAll();
}

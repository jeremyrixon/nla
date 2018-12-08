package org.jais.nla.domain.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String contactNumber;

    @OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Set<Book> books = new HashSet<>();


    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(final String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(final Book book){
        books.add(book);
        book.setPerson(this);
    }

    @Override
    public String toString() {
        return format("Person[id=%d, firstName='%s', lastName='%s', emailAddress='%s', contactNumber='%s']",
                id, firstName, lastName, email, contactNumber);
    }

}

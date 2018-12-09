package org.jais.nla.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String isbn;

    @Version
    private Integer version;

    public Book() {
    }

    public Book(final String title, final String author, final String isbn, final Person person) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(final Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Book)) {
            return false;
        }
        final Book book = (Book) obj;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }
}

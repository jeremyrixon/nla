package org.jais.nla.controller;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.service.LibraryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by vandanajaiswal on 9/12/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = PersonController.class, secure = false)
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LibraryService libraryService;

    @Test
    public void shouldReturnJsonArrayWhenGetBooksWithPersonId() throws Exception {
        //Not happy with this test
        final Book book = new Book("title", "author", "isbn");

        final List<Book> allbooks = Arrays.asList(book);

        given(libraryService.getBooksLentToPerson(eq(1))).willReturn(allbooks);

        this.mockMvc.perform(get("/person/1/books")
                .contentType(MediaType.APPLICATION_JSON_VALUE));
    }
}

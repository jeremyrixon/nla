package org.jais.nla.controller;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.model.Person;
import org.jais.nla.domain.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String display(final Model model) {
        model.addAttribute("greetings", "Welcome to Library");
        return "index";
    }

	@GetMapping("/people")
    public ModelAndView getPeople() {
        final List<Person> personList = libraryService.getPersons();
        final ModelAndView mv = new ModelAndView("people");
        final Map<String, Object> modelMap = new HashMap();
        modelMap.put("personList", personList);
        mv.addAllObjects(modelMap);
        return mv;
    }

	@GetMapping("/books")
    public ModelAndView getBooks() {
        final List<Book> books = libraryService.getAllBooks();
        final ModelAndView mv = new ModelAndView("books");
        final Map<String, Object> modelMap = new HashMap();
        modelMap.put("bookList", books);
        mv.addAllObjects(modelMap);
        return mv;
    }

}


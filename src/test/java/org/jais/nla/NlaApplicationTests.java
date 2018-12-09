package org.jais.nla;

import org.jais.nla.controller.LibraryController;
import org.jais.nla.controller.PersonController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NlaApplicationTests {

	@Autowired
	private PersonController personController;

	@Autowired
	private LibraryController libraryController;

	@Test
	public void contextLoads() {
		assertThat(personController).isNotNull();
		assertThat(libraryController).isNotNull();
	}

}

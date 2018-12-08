package org.jais.nla;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.jais.nla.domain.repository")
@EntityScan("org.jais.nla.domain.model")
@SpringBootApplication
public class NlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NlaApplication.class, args);
	}
}

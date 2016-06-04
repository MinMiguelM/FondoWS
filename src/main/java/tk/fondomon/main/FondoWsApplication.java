package tk.fondomon.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories(basePackages="tk.fondomon.repositories")
@EntityScan(basePackages="tk.fondomon.entities")
@ComponentScan(basePackages={"tk.fondomon.controllers", "tk.fondomon.repositories","tk.fondomon.entities"})
@EnableAutoConfiguration
@EnableWebMvc
public class FondoWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FondoWsApplication.class, args);
	}
}

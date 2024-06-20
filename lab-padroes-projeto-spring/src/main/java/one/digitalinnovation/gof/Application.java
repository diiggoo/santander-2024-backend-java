package one.digitalinnovation.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* Projeto Spring Boot gerado via Spring Initializr.
* Os seguintes módulos foram selecionados:
* - Spring Data JPA
* - Spring WEB
* - H2 Database
* - OpenFeign
*
* @author diiggoo
*/

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package br.edu.eteczl.catracatechbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatracatechbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatracatechbackendApplication.class, args);
	}

	// http://localhost:8080/ola
	@GetMapping("/ola")
	public String ola(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return String.format("<span style=\"color:purple; font-size:30px;\">Olá %s!</span>", nome);
	}

	@GetMapping("/liberarCatraca")
	public String liberarCatraca(@RequestParam(value = "ra", defaultValue = "0") int ra) {
		if (ra > 0) {
			if (ra == 22135 || ra == 22145 || ra == 22155) {
				// http://localhost:8080/liberarCatraca?ra=22135
				return String.format("<span style=\"color:green; font-size:30px;\">Catraca Liberada %d!</span>", ra);
			} else {
				// http://localhost:8080/liberarCatraca?ra=5
				return String.format("<span style=\"color:blue; font-size:30px;\">Aluno %d não encontrado!<span>", ra);
			}
		} else { 
			// http://localhost:8080/liberarCatraca?ra=0
			return String.format("<span style=\"color:red; font-size:30px;\">RA: %d. Acesso negado!<span>", ra);
		}
	}

	// http://localhost:8080/
	@GetMapping("/**")
	public String fallback() {
		return String.format("<span style=\"color:red; font-size:30px;\">404 Página não encontrada!</span>");
	}
}
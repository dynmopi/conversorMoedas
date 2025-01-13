package br.com.conversordemoeda.conversormoeda;

import br.com.conversordemoeda.conversormoeda.principal.Principal;
import br.com.conversordemoeda.conversormoeda.service.ConversaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorMoedaApplication implements CommandLineRunner {

	@Autowired
	private ConversaoService conversaoService;

	@Autowired
	private Principal principal;


	public static void main(String[] args) {
		SpringApplication.run(ConversorMoedaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.aplicacao();
	}
}

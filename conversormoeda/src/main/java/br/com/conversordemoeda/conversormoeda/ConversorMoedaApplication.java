package br.com.conversordemoeda.conversormoeda;

import br.com.conversordemoeda.conversormoeda.service.ConversaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorMoedaApplication implements CommandLineRunner {

	@Autowired
	private ConversaoService conversaoService;

	public static void main(String[] args) {
		SpringApplication.run(ConversorMoedaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		double valorConvertido = conversaoService.converter("USD", "BRL", 100.0);
		System.out.println("Valor convertido: " + valorConvertido);
	}
}

package br.com.conversordemoeda.conversormoeda.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DesligarTomCat {

    private final ConfigurableApplicationContext context;

    public DesligarTomCat(ConfigurableApplicationContext context) {
        this.context = context;
    }

    // chamar esse metodo para desligar o tomcat
    public void desligar(){
        SpringApplication.exit(context, () -> 0);
    }
}

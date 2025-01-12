package br.com.conversordemoeda.conversormoeda.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class ConversaoService {

    @Value("{$API_KEY}")
    private String API_KEY;
    private final String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double converter(String primeiraMoeda, String segundaMoeda, double valor){
        RestTemplate restTemplate = new RestTemplate();
        String url = URL + primeiraMoeda;

        MoedaResponse resposta = restTemplate.getForObject(url, MoedaResponse.class);

        if(resposta != null && resposta.getConversionRates().containsKey(segundaMoeda)){

        }
    }
}

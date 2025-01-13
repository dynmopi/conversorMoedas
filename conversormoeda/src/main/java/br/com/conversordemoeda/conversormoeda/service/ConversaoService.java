package br.com.conversordemoeda.conversormoeda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConversaoService {

    private final String API_KEY = System.getenv("API_KEY");
    private final String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double converter(String primeiraMoeda, String segundaMoeda, double valor){
        RestTemplate restTemplate = new RestTemplate();
        String url = URL + primeiraMoeda;

        if (API_KEY == null || API_KEY.isEmpty()) {
            System.out.println("[AVISO] API_KEY não configurada no ambiente.");
            System.exit(1);
        }

        MoedaResponse resposta = restTemplate.getForObject(url, MoedaResponse.class);

        if(resposta != null && resposta.getConversionRates().containsKey(segundaMoeda)){
            double taxa = resposta.getConversionRates().get(segundaMoeda);
            return valor*taxa;
        }
        throw new RuntimeException("Erro na conversão");
    }
}

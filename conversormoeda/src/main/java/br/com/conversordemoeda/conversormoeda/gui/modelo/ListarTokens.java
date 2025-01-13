package br.com.conversordemoeda.conversormoeda.gui.modelo;

import br.com.conversordemoeda.conversormoeda.service.MoedaResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ListarTokens {
    // instacia a apikey diretamente nas variáveis de ambiente
//    private final String API_KEY = System.getenv("API_KEY");
    private final String API_KEY = "a1773d61488cf7a58a9a55d6";
    // metodo que lista todas as moedas compativeis para as conversoes
    public void listarTokens() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
        try {
            // validador da chave
            if(API_KEY == null || API_KEY.isEmpty()){
                System.out.println("[AVISO] API_KEY não configurada no ambiente.");
                System.exit(1);
            }

            // desserializacao
            MoedaResponse resposta = restTemplate.getForObject(url, MoedaResponse.class);

            // impressao
            if (resposta != null && resposta.getConversionRates() != null) {
                System.out.println("Tokens disponíveis com referência ao USD:");
                resposta.getConversionRates().forEach((moeda, taxa) -> {
                    System.out.println(moeda + ": " + taxa);
                });
            } else {
                System.out.println("Não foi possível obter os tokens.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar os tokens: " + e.getMessage());

        }


    }


}

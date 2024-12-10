package Principal;

import GUI.LimparConsole;
import GUI.TelaInicial;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner prompt = new Scanner(System.in);
        LimparConsole limpar = new LimparConsole();
        TelaInicial imprimir = new TelaInicial();

        imprimir.imprimirTela();
        prompt.nextLine();
        limpar.limparConsole();


        //requisicao

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://foo.com/"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

    }
}
package br.com.conversordemoeda.conversormoeda.gui;

import java.util.Scanner;

public class Menu {

    public String mostrarMenu() {
        Scanner leitura = new Scanner(System.in);
        var opcao = -1;
        while(opcao == -1){
            var listarOpcoes = """

1 - Fazer a cotação 
2 - Listar todas as moedas disponíveis
3 - Sair da aplicação
                    """;

            System.out.println(listarOpcoes);

            opcao = leitura.nextInt();
            switch (opcao){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, por favor informe novamente");
            }
        }
        return null;
    }
}

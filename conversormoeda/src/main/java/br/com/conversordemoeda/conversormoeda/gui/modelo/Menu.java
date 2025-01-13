package br.com.conversordemoeda.conversormoeda.gui.modelo;

import br.com.conversordemoeda.conversormoeda.gui.LimparConsole;
import br.com.conversordemoeda.conversormoeda.service.ConversaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.Scanner;

    @Component
    public class Menu {

        @Autowired
        private ConversaoService conversaoService;

        @Autowired
        private ListarTokens listar;

        @Autowired
        private LimparConsole limpar;

        private final Scanner leitura = new Scanner(System.in);

        public void iniciar() {
            while (true) {
                exibirMenu();
                int opcao = lerOpcao();
                processarOpcao(opcao);
            }
        }

        private void exibirMenu() {
            System.out.println("""
                
                1 - Fazer a cotação
                2 - Listar todas as moedas disponíveis
                3 - Sair da aplicação
                """);
        }

        private int lerOpcao() {
            try {
                System.out.print("Escolha uma opção: ");
                return leitura.nextInt();
            } catch (InputMismatchException e) {
                leitura.nextLine();
                System.out.println("Erro, escolha apenas números.");
                return -1;
            }
        }

        private void processarOpcao(int opcao) {
            switch (opcao) {
                case 1 -> realizarConversao();
                case 2 -> listar.listarTokens();
                case 3 -> encerrarAplicacao();
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        private void realizarConversao() {
            leitura.nextLine(); // Limpa o buffer do Scanner
            System.out.print("Digite o primeiro Token (USD, BRL, EUR): ");
            String primeiraMoeda = leitura.nextLine().trim();

            System.out.print("Digite o segundo Token: ");
            String segundaMoeda = leitura.nextLine().trim();

            if (primeiraMoeda.isBlank() || segundaMoeda.isBlank()) {
                System.out.println("Tokens não podem ser vazios. Tente novamente.");
                return;
            }

            System.out.print("Digite o valor em " + primeiraMoeda.toUpperCase() + ": ");
            double valor;
            try {
                valor = leitura.nextDouble();
            } catch (InputMismatchException e) {
                leitura.nextLine();
                System.out.println("Valor inválido. Tente novamente.");
                return;
            }

            try {
                double valorConvertido = conversaoService.converter(primeiraMoeda.toUpperCase(), segundaMoeda.toUpperCase(), valor);
                limpar.limparConsole();
                System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, segundaMoeda.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Erro ao processar a solicitação: " + e.getMessage());
            }
        }

        private void encerrarAplicacao() {
            System.out.println("Saindo da aplicação...");
            System.exit(0);
        }
    }


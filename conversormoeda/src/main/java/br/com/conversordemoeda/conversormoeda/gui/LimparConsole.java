package br.com.conversordemoeda.conversormoeda.gui;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LimparConsole {
    // funciona caso você utilize pelo terminal do seu sistema operacional
    public void limparConsole(){
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                // limpar a tela no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // limpar a tela no Linux ou macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Sistema não suportado para limpeza automática.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

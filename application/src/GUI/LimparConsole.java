package GUI;


import Principal.Main;

import java.io.IOException;

public class LimparConsole {
    public static void limparConsole(){
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                // Limpar a tela no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Limpar a tela no Linux ou macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Sistema não suportado para limpeza automática.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
//public class LimparConsole extends Main {
//    public final static void limparConsole()
//    {
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
//    }
//}

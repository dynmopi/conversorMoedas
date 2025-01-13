package br.com.conversordemoeda.conversormoeda.gui;

import org.springframework.stereotype.Component;

@Component
public class TelaInicial {
    public void splash(){
        System.out.println("""  
    ____                            _              \s
      / ___| ___  _ __   __ _ _ __ ___| |__   ___ _ __\s
     | |    / _ \\| '_ \\ / _` | '__/ __| '_ \\ / _ \\ '__|
     | |___| (_) | | | | (_| | | | (__| | | |  __/ |  \s
      \\_____\\___/|_| |_|\\__,_|_|  \\___|_| |_|\\___|_|  \s
                                                     \s
       __  __           _           _                 \s
      |  \\/  | ___  ___| |_   _ ___| |_ ___  _ __     \s
      | |\\/| |/ _ \\/ __| | | | / __| __/ _ \\| '__|    \s
      | |  | |  __/ (__| | |_| \\__ \\ || (_) | |       \s
      |_|  |_|\\___|\\___|_|\\__,_|___/\\__\\___/|_|       \s
    
            |=|=| Conversor de Moedas |=|=|              \s
     Otimize suas cotações e ganhe mais produtividade!     \s    
                """);
        System.out.println("\t Pressione enter para iniciar");
    }
}

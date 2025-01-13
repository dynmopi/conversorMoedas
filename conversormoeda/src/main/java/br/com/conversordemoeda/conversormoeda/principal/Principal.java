package br.com.conversordemoeda.conversormoeda.principal;

import br.com.conversordemoeda.conversormoeda.gui.LimparConsole;
import br.com.conversordemoeda.conversormoeda.gui.TelaInicial;
import br.com.conversordemoeda.conversormoeda.gui.modelo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal {

    private TelaInicial telaInicial;
    private Menu menu;
    private LimparConsole limparConsole;
    private Scanner leitura = new Scanner(System.in);

    @Autowired
    public Principal(TelaInicial telaInicial, Menu menu, LimparConsole limparConsole) {
        this.telaInicial = telaInicial;
        this.limparConsole = limparConsole;
        this.menu = menu;
    }

    public void aplicacao(){
        telaInicial.splash();
        leitura.nextLine(); // um enter para continuar a aplicação

        menu.iniciar();
    }
}

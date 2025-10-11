package org.example;

import org.example.Ferramentas.Delay;
import org.example.view.MenuPrincipal;

import static org.example.view.MenuPrincipal.CIANO;
import static org.example.view.MenuPrincipal.RESET;

public class Main {

    static Delay d = new Delay();

    public static void main(String[] args) {
        System.out.println(CIANO+"- - - - - - - - - - - - - - - -"+RESET);
        System.out.println(CIANO+" SEJA BEM VINDO A CALCULADORA !"+RESET);
        System.out.println(CIANO+"- - - - - - - - - - - - - - - -"+RESET);
        System.out.println("\n\n");
        d.time(1500);

        MenuPrincipal.exibir();
    }
}
package org.example.model.Teoria;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class Modulo {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            double valor = sc.nextDouble();
            System.out.println("Valor absoluto: " + Math.abs(valor));
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

package org.example.model.OperacoesAvancada;

import org.example.model.Calculadora;
import java.util.Scanner;

public class Potenciacao {

    public static void executar(Calculadora calc) {
        Scanner sc = new Scanner(System.in);
        double base, expoente;

        try {
            if (Double.isNaN(calc.getValorAtual())) {
                System.out.print("Digite a base: ");
                base = sc.nextDouble();
            } else {
                base = calc.getValorAtual();
                System.out.println("Usando valor atual como base: " + base);
            }

            System.out.print("Digite o expoente: ");
            expoente = sc.nextDouble();

            double resultado = Math.pow(base, expoente);
            calc.setValorAtual(resultado);
            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

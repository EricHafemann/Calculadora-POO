package org.example.model.OperacoesAvancada;

import org.example.model.Calculadora;
import java.util.Scanner;

public class Fatorial {

    public static void executar(Calculadora calc) {
        Scanner sc = new Scanner(System.in);
        double valor;

        try {
            if (Double.isNaN(calc.getValorAtual())) {
                System.out.print("Digite um número inteiro para o fatorial: ");
                valor = sc.nextDouble();
            } else {
                valor = calc.getValorAtual();
                System.out.println("Usando valor atual: " + valor);
            }

            if (valor < 0 || valor != Math.floor(valor)) {
                System.out.println("❌ Erro: fatorial só é válido para inteiros não negativos.");
                return;
            }

            double resultado = 1;
            for (int i = 1; i <= (int) valor; i++) {
                resultado *= i;
            }

            calc.setValorAtual(resultado);
            System.out.println("Resultado do fatorial: " + resultado);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

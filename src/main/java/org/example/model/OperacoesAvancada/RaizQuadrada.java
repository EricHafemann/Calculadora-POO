package org.example.model.OperacoesAvancada;

import org.example.Ferramentas.Delay;
import org.example.model.Calculadora;
import java.util.Scanner;

public class RaizQuadrada {

    public static Delay D = new Delay();

    public static void executar(Calculadora calc) {
        Scanner sc = new Scanner(System.in);
        double valor;

        try {
            if (Double.isNaN(calc.getValorAtual())) {
                System.out.print("Digite um número para a raiz quadrada: ");
                valor = sc.nextDouble();
            } else {
                valor = calc.getValorAtual();
                System.out.println("Usando valor atual: " + valor);
            }

            if (valor < 0) {
                System.out.println("❌ Erro: não existe raiz quadrada real de número negativo.");
                D.time(1500);
                return;
            }

            double resultado = Math.sqrt(valor);
            calc.setValorAtual(resultado);
            System.out.println("Resultado da raiz: " + resultado);
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

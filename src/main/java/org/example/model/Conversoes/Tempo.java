package org.example.model.Conversoes;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class Tempo {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\n⏱️ Conversões de Tempo");
            System.out.println("[1] Segundos → Minutos");
            System.out.println("[2] Minutos → Horas");
            System.out.println("[3] Horas → Minutos");
            System.out.println("[4] Minutos → Segundos");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            double resultado = switch (op) {
                case 1 -> valor / 60;
                case 2 -> valor / 60;
                case 3 -> valor * 60;
                case 4 -> valor * 60;
                default -> Double.NaN;
            };

            if (Double.isNaN(resultado)) {
                System.out.println("❌ Opção inválida.");
                D.time(1500);
            } else {
                System.out.println("Resultado: " + resultado);
                D.time(1500);
            }

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

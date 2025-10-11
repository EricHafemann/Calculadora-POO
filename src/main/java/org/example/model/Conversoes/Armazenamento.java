package org.example.model.Conversoes;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class Armazenamento {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\n💾 Conversões de Armazenamento");
            System.out.println("[1] Bytes → KB");
            System.out.println("[2] KB → MB");
            System.out.println("[3] MB → GB");
            System.out.println("[4] GB → TB");
            System.out.println("[5] TB → GB");
            System.out.println("[6] GB → MB");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            double resultado = switch (op) {
                case 1 -> valor / 1024;
                case 2 -> valor / 1024;
                case 3 -> valor / 1024;
                case 4 -> valor / 1024;
                case 5 -> valor * 1024;
                case 6 -> valor * 1024;
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

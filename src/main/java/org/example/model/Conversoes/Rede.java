package org.example.model.Conversoes;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class Rede {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\n🌐 Conversões de Rede");
            System.out.println("[1] Mbps → MB/s");
            System.out.println("[2] MB/s → Mbps");
            System.out.println("[3] Gbps → Mbps");
            System.out.println("[4] Mbps → Gbps");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            double resultado = switch (op) {
                case 1 -> valor / 8;       // 8 bits = 1 byte
                case 2 -> valor * 8;
                case 3 -> valor * 1000;
                case 4 -> valor / 1000;
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

package org.example.model.Teoria;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class MDC {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            while (b != 0) {
                int resto = a % b;
                a = b;
                b = resto;
            }

            System.out.println("MDC: " + a);
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

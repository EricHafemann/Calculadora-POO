package org.example.model.Teoria;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class MMC {

    public static Delay D = new Delay();

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            int mmc = (a * b) / mdc(a, b);
            System.out.println("MMC: " + mmc);
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }

    private static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}

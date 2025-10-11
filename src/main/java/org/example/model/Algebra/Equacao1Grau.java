package org.example.model.Algebra;

import java.util.Scanner;

public class Equacao1Grau {

    public static void resolver() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Equação do tipo: ax + b = 0");
            System.out.print("Digite o valor de a: ");
            double a = sc.nextDouble();
            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();

            if (a == 0) {
                System.out.println("❌ Não é equação de 1º grau (a não pode ser 0).");
                return;
            }

            double x = -b / a;
            System.out.println("Solução: x = " + x);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

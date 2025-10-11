package org.example.model.Algebra;

import java.util.Scanner;

public class Equacao2Grau {

    public static void resolver() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Equação do tipo: ax² + bx + c = 0");
            System.out.print("Digite o valor de a: ");
            double a = sc.nextDouble();
            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor de c: ");
            double c = sc.nextDouble();

            if (a == 0) {
                System.out.println("❌ Não é equação de 2º grau (a não pode ser 0).");
                return;
            }

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("❌ Não existem raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Raiz dupla: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

package org.example.model.Trigonometria;

import org.example.Ferramentas.Delay;

import java.util.Scanner;

public class Trigonometria {

    public static Delay D = new Delay();

    public static void seno() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angulo = Math.toRadians(sc.nextDouble());
            System.out.println("Seno: " + Math.sin(angulo));
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }

    public static void cosseno() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angulo = Math.toRadians(sc.nextDouble());
            System.out.println("Cosseno: " + Math.cos(angulo));
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }

    public static void tangente() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o ângulo (em graus): ");
            double angulo = Math.toRadians(sc.nextDouble());
            System.out.println("Tangente: " + Math.tan(angulo));
            D.time(2000);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        }
    }
}

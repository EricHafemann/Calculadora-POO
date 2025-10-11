package org.example.model.NumerosComplexos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacoesComplexas {

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número complexo:");
            System.out.print("Parte real: ");
            double real1 = sc.nextDouble();
            System.out.print("Parte imaginária: ");
            double imag1 = sc.nextDouble();

            System.out.println("\nDigite o segundo número complexo:");
            System.out.print("Parte real: ");
            double real2 = sc.nextDouble();
            System.out.print("Parte imaginária: ");
            double imag2 = sc.nextDouble();

            System.out.println("\nEscolha a operação:");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Módulo do primeiro");
            System.out.println("[6] Conjugado do primeiro");
            System.out.print("\n: ");

            int opcao = sc.nextInt();

            double resultadoReal = 0, resultadoImag = 0;

            switch (opcao) {
                case 1 -> {
                    resultadoReal = real1 + real2;
                    resultadoImag = imag1 + imag2;
                    System.out.printf("\nResultado: %.2f + %.2fi\n", resultadoReal, resultadoImag);
                }
                case 2 -> {
                    resultadoReal = real1 - real2;
                    resultadoImag = imag1 - imag2;
                    System.out.printf("\nResultado: %.2f + %.2fi\n", resultadoReal, resultadoImag);
                }
                case 3 -> {
                    resultadoReal = (real1 * real2) - (imag1 * imag2);
                    resultadoImag = (real1 * imag2) + (imag1 * real2);
                    System.out.printf("\nResultado: %.2f + %.2fi\n", resultadoReal, resultadoImag);
                }
                case 4 -> {
                    double denom = (real2 * real2) + (imag2 * imag2);
                    if (denom == 0) throw new ArithmeticException("Divisão por zero no número complexo!");
                    resultadoReal = ((real1 * real2) + (imag1 * imag2)) / denom;
                    resultadoImag = ((imag1 * real2) - (real1 * imag2)) / denom;
                    System.out.printf("\nResultado: %.2f + %.2fi\n", resultadoReal, resultadoImag);
                }
                case 5 -> {
                    double modulo = Math.sqrt(real1 * real1 + imag1 * imag1);
                    System.out.printf("\n|z1| = %.2f\n", modulo);
                }
                case 6 -> {
                    System.out.printf("\nConjugado: %.2f + %.2fi\n", real1, -imag1);
                }
                default -> System.out.println("\n-- Opção inválida --");
            }
        } catch (InputMismatchException e) {
            System.err.println("\n❌ Erro: Digite apenas números válidos (use ponto, não vírgula).");
        } catch (ArithmeticException e) {
            System.err.println("\n❌ Erro matemático: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n❌ Erro inesperado: " + e.getMessage());
        }
    }
}

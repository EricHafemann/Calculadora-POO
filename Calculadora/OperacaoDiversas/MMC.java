package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class MMC {

    public static void calcularMMC(Calculadora calculadora) {
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = Utility.lerInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = Utility.lerInt();

        if (num1 == num2) {
            calculadora.setResultadoAtual(num1);
            calculadora.setPossuiResultado(true);
            System.out.println("\n-- O MMC entre " + num1 + " e " + num2 + " é: " + num1 + " --\n");
            return;  
        }

        int maior = Math.max(num1, num2);

        while (true) {
            if (maior % num1 == 0 && maior % num2 == 0) {
                break;
            }
            maior++;
        }

        calculadora.setResultadoAtual(maior);
        calculadora.setPossuiResultado(true);

        System.out.println("\n-- O MMC entre " + num1 + " e " + num2 + " é: " + maior + " --\n");
    }
}
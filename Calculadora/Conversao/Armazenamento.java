package Conversao;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Armazenamento {

    public static void bytesParaKb (Calculadora calc)
    {
        System.out.println("Digite o valor em Bytes: ");
        double valorBytes = Utility.lerDouble();
        Utility.leString();

        double valorKb = valorBytes / 1024;


        System.out.printf("\nO valor de %.2f Bytes é igual a %.2f KB", valorBytes, valorKb);

        calc.setResultadoAtual(valorKb);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void kbParaMb (Calculadora calc)
    {
        System.out.println("Digite o valor em KB: ");
        double valorKB = Utility.lerDouble();
        Utility.leString();

        double valorMB = valorKB / 1024;


        System.out.printf("\nO valor de %.2f Kb é igual a %.2f MB", valorKB, valorMB);

        calc.setResultadoAtual(valorMB);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void gbParaMb (Calculadora calc)
    {
        System.out.println("Digite o valor em GB: ");
        double valorGb = Utility.lerDouble();
        Utility.leString();

        double valorMB = valorGb * 1024;


        System.out.printf("\nO valor de %.2f GB é igual a %.2f MB", valorGb, valorMB);

        calc.setResultadoAtual(valorMB);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void tbParaGb (Calculadora calc)
    {
        System.out.println("Digite o valor em TB: ");
        double valorTb = Utility.lerDouble();
        Utility.leString();

        double valorGb = valorTb * 1024;

        System.out.printf("\nO valor de %.2f TB é igual a %.2f GB", valorTb, valorGb);

        calc.setResultadoAtual(valorGb);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

}

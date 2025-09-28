package Conversao;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Processamento {

    public static void ghzParaMHz(Calculadora calc)
    {
        System.out.println("Digite o valor em GHz: ");
        double valorGhz = Utility.lerDouble();
        Utility.leString();

        double valorMhz = valorGhz * 1000;

        System.out.printf("\nO valor de %.2f GHz é igual a %.2f MHz", valorGhz, valorMhz);

        calc.setResultadoAtual(valorMhz);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void mhzParaGhz(Calculadora calc)
    {
        System.out.println("Digite o valor em MHz: ");
        double valorMhz = Utility.lerDouble();
        Utility.leString();

        double valorGhz = valorMhz / 1000;

        System.out.printf("\nO valor de %.2f MHz é igual a %.2f GHz", valorMhz, valorGhz);

        calc.setResultadoAtual(valorGhz);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }
}

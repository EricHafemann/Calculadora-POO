package Conversao;

import Operacao.Calculadora;
import Utilidades.Utility;

public class VelocidadeRede {

    public static void mbpsParaMBs (Calculadora calc)
    {
        System.out.println("Digite o valor em Mbps: ");
        double valorMbps = Utility.lerDouble();
        Utility.leString();

        double valorMbs = valorMbps / 8;


        System.out.printf("\nO valor de %.2f Mbps é igual a %.2f MB/s", valorMbps, valorMbs);

        calc.setResultadoAtual(valorMbs);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void gbpsParaMbps(Calculadora calc)
    {
        System.out.println("Digite o valor em Gbps: ");
        double valorGbps = Utility.lerDouble();
        Utility.leString();

        double valorMbps = valorGbps * 1000;

        System.out.printf("\nO valor de %.2f Gbps é igual a %.2f Mbps", valorGbps, valorMbps);

        calc.setResultadoAtual(valorMbps);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }
}

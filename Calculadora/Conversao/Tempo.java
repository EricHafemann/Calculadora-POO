package Conversao;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Tempo {

    public static void SegundoParaMinuto (Calculadora calc)
    {
        System.out.println("Digite o valor em segundo: ");
        double valorSec = Utility.lerDouble();
        Utility.leString();

        double valorMinuto = valorSec / 60;

        String seg = (valorSec > 1) ? "Segundos" : "Segundo";
        String min = (valorMinuto > 1) ? "Minutos" : "Minuto";

        System.out.printf("\nO valor %.2f %s é igual a %.2f %s", valorSec, seg, valorMinuto, min);

        calc.setResultadoAtual(valorMinuto);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }

    public static void horaParaSegundo (Calculadora calc)
    {
        System.out.println("Digite o valor em Horas: ");
        double valorHora = Utility.lerDouble();
        Utility.leString();

        double valorSec = (valorHora * 60) * 60;

        System.out.printf("\nO valor %.2f hora(s) é igual a %.2f segundos.", valorHora, valorSec);

        calc.setResultadoAtual(valorSec);
        calc.setPossuiResultado(true);
        Utility.Delay(1500);
        Utility.Cls(20);
    }
}

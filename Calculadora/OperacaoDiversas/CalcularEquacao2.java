package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class CalcularEquacao2 {

    public static void calcularEquacao2 (Calculadora calc, int a,int b, int c)
    {
        double delta = (b * b) - (4 * a * c);
        double x1 = ((-1*b) + Math.sqrt(delta)) / 2 * a;
        double x2 = ((-1*b) - Math.sqrt(delta)) / 2 * a;

        if (a == 0)
        {
            System.out.println("\n-- O valor de A não pode ser 0 --");
            Utility.Delay(2000);
            Utility.Cls(20);
        }


        if (delta < 0)
        {
            System.out.println("\n-- Não tem resposta. Delta Negativo --\n");
            Utility.Delay(2000);
            Utility.Cls(20);
        }

        else if (delta == 0)
        {
            System.out.println("\n* O Resultado é :");
            System.out.println("X = "+x1);
            Utility.Delay(2000);
            Utility.Cls(20);
        }
        else
        {
            System.out.println("\n-- O Resultado da Equação é :");
            System.out.println("X' = "+x1);
            System.out.println("X''= "+x2);
            Utility.Delay(2000);
            Utility.Cls(20);
        }
    }
}

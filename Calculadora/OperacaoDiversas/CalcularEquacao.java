package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class CalcularEquacao {

    public static void calcularEquacao (Calculadora calc ,int a, int b)
    {
        int x = (-1*b) / a;

        calc.setPossuiResultado(true);
        calc.setResultadoAtual(x);


        System.out.println("A solução de "+a+"X +"+b+" = 0 é igual a "+x);
        Utility.Delay(2000);
        Utility.Cls(20);



    }
}

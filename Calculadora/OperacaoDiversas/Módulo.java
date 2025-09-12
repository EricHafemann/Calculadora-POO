package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Módulo extends Calculadora{
    
    public static void calcularModulo(Calculadora calculadora) {
        if (calculadora.getResultadoAtual() < 0) {
            calculadora.setResultadoAtual(calculadora.getResultadoAtual() * -1);
        }
        else
        {
        System.out.println("\n-- O valor do módulo é : "+calculadora.getResultadoAtual()+" . --\n");
        Utility.Cls(15);
        Utility.Delay(2000);
        }
    }

    
}

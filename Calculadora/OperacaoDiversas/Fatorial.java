package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Fatorial extends Calculadora {
    
    public static void calcularFatorial(Calculadora calculadora) {
        if (calculadora.getResultadoAtual() < 0) {
            System.out.println("\n-- Número deve ser não negativo. -- \n");
            Utility.Delay(2000);
            Utility.Cls(20);
            calculadora.setPossuiResultado(false);
            calculadora.setResultadoAtual(Double.NaN);
        }
        int fatorial = 1;
        for (int i = 1; i <= calculadora.getResultadoAtual(); i++) {
            fatorial *= i;
        }
        calculadora.setResultadoAtual(fatorial);
    }
}

package OperacaoDiversas;

import Operacao.Calculadora;
import Utilidades.Utility;

public class Potencia extends Calculadora{

    public static void calcularFatorial (int valorFatorial, Calculadora calculadora) {

        if (valorFatorial < 0) {
            System.out.println("\nErro: Fatorial de um número negativo não é definido.\n");
            Utility.Delay(2000);
            calculadora.setResultadoAtual(Double.NaN); 
            calculadora.setPossuiResultado(false);
            return; 
        }
        
        if (valorFatorial == 0) {
            calculadora.setResultadoAtual(1); 
            return; 
        }

        else
        {
            double resultado = Math.pow(calculadora.getResultadoAtual(), valorFatorial);
            calculadora.setResultadoAtual(resultado);
        }

    }
}
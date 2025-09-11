package OperacaoDiversas;

import Operacao.Calculadora;

public class Raiz extends Calculadora{

    

    public static void descobrirRaiz (Calculadora calculadora)
    {
        double raizResult = Math.sqrt(calculadora.getResultadoAtual());
        calculadora.setResultadoAtual(raizResult);
    } 
    
}

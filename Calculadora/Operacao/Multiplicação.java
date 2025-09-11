package Operacao;

public class Multiplicação extends Calculadora{
    
    public static void Multiplicar (Calculadora calculadora)
    {
        double multResult = calculadora.getN1() * calculadora.getN2();
        calculadora.setResultadoAtual(multResult);
    }

    public static void MultiplicarAdicional (Calculadora calculadora)
    {
        double multResult = calculadora.getResultadoAtual() * calculadora.getNumeroAdicional();
        calculadora.setResultadoAtual(multResult);
    }

}

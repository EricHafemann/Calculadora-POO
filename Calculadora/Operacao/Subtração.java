package Operacao;

public class Subtração {
    
    public static void Subtrair (Calculadora calculadora)
    {
        double subResult = calculadora.getN1() - calculadora.getN2();
        calculadora.setResultadoAtual(subResult);
    }

    public static void SubtrairAdicional (Calculadora calculadora)
    {
        double subResult = calculadora.getResultadoAtual() - calculadora.getNumeroAdicional();
        calculadora.setResultadoAtual(subResult);
    }

}

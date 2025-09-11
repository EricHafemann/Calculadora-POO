package Operacao;

public class Soma extends Calculadora{
    
    public static void Somar (Calculadora calculadora)
    {
        double somaResult = calculadora.getN1() + calculadora.getN2();
        calculadora.setResultadoAtual(somaResult);
        
    }

    public static void SomarAdicional (Calculadora calculadora)
    {
        double somaResult = calculadora.getResultadoAtual() + calculadora.getNumeroAdicional();
        calculadora.setResultadoAtual(somaResult);
        
    }
}

package Operacao;

public class Divisão {
    
    public static void Dividir (Calculadora calculadora)
    {
        double multResult = calculadora.getN1() / calculadora.getN2();
        calculadora.setResultadoAtual(multResult);
        
    }

    public static void DividirAdicional (Calculadora calculadora)
    {
        double divResult = calculadora.getResultadoAtual() / calculadora.getNumeroAdicional();
        calculadora.setResultadoAtual(divResult);
        
    }
}

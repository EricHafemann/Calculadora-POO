package Operacao;

import OperacaoDiversas.Potencia;
import OperacaoDiversas.Raiz;
import Utilidades.Utility;

public class Calculadora {

    private double n1;
    private double n2;
    private double numeroAdicional;
    private double resultadoAtual;
    private boolean possuiResultado;
    private boolean OperacaoDiversas;
    private boolean isPotencia; 
    private int valorExpoente;
    
    public void solicitarNumeros ()
    {

        if (isOperacaoDiversas())
        {
            if (!isPossuiResultado())
            {
                System.out.println("\n\nDigite o valor: ");
                double valorRaiz = Utility.lerDouble();

                setResultadoAtual(valorRaiz);
            }
        }

        else if (isPotencia())
        {
            if (isPossuiResultado())
            {
                System.out.println("\nDigite o valor do expoente: ");
                int valorExpoente = Utility.lerInt();

                setValorExpoente(valorExpoente);
            }

            else
            {
                System.out.println("\nDigite o numero: ");
                double valorTotal = Utility.lerDouble();

                setResultadoAtual(valorTotal);


                System.out.println("\nDigite o valor do expoente: ");
                int valorExpoente = Utility.lerInt();

                setValorExpoente(valorExpoente);
            }
        }

        else if (isPossuiResultado())
        {
            System.out.println("\nDigite o número:  ");
            setNumeroAdicional(Utility.lerDouble());
            Utility.leString();
        }
        else
        {

            System.out.println("\nDigite o primeiro número: ");
            double numero1 = Utility.lerDouble();

            System.out.println("\nDigite o segundo número: ");
            double numero2 = Utility.lerDouble();

            setN1(numero1);
            setN2(numero2);
        }
    }



    public void exibirResultado ()
    {
        String numero = String.format("%.2f", getResultadoAtual());

        int largura = 26;
        int espacos = (largura - numero.length()) / 2;

        // Monta a linha centralizada
        String linha = " ".repeat(espacos) + numero;

        System.out.println("-".repeat(largura));
        System.out.println(linha);
        System.out.println("-".repeat(largura) + "\n");
    }



    public double getN1() 
    {
        return n1;
    }

    public void setN1(double n1)
    {
        this.n1 = n1;
    }

    public double getN2() 
    {
        return n2;
    }

    public void setN2(double n2) 
    {
        this.n2 = n2;
    }

    public double getNumeroAdicional() 
    {
        return numeroAdicional;
    }

    public void setNumeroAdicional(double numeroAdicional) 
    {
        this.numeroAdicional = numeroAdicional;
    }

    public double getResultadoAtual() 
    {
        return resultadoAtual;
    }

    public double setResultadoAtual(double resultadoAtual) 
    {
        return this.resultadoAtual = resultadoAtual;
    }

    public boolean isPossuiResultado() 
    {
        return possuiResultado;
    }

    public void setPossuiResultado(boolean possuiResultado) 
    {
        this.possuiResultado = possuiResultado;
    }

    public boolean isOperacaoDiversas() 
    {
        return OperacaoDiversas;
    }

    public void setOperacaoDiversas(boolean operacaoDiversas)
    {
        OperacaoDiversas = operacaoDiversas;
    }

    public boolean isPotencia() 
    {
        return isPotencia;
    }

    public void setPotencia(boolean isFatorial) 
    {
        this.isPotencia = isFatorial;
    }

    public int getValorExpoente() 
    {
        return valorExpoente;
    }

    public void setValorExpoente(int valorExpoente) 
    {
        this.valorExpoente = valorExpoente;
    }

    
}
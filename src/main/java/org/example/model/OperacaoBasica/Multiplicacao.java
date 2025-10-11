package org.example.model.OperacaoBasica;

import org.example.model.Calculadora;

public class Multiplicacao extends Calculadora {

    public Multiplicacao() {}

    public Multiplicacao(Calculadora calc) {
        this.valorAtual = calc.getValorAtual();
    }

    @Override
    public void operar(double valor) {
        if (!temValor()) valorAtual = 1; // começa em 1 para multiplicação
        valorAtual *= valor;
        mostrarVisor();
    }
}

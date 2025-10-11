package org.example.model.OperacaoBasica;

import org.example.model.Calculadora;

public class Subtracao extends Calculadora {

    public Subtracao() {}

    public Subtracao(Calculadora calc) {
        this.valorAtual = calc.getValorAtual();
    }

    @Override
    public void operar(double valor) {
        if (!temValor()) valorAtual = 0;
        valorAtual -= valor;
        mostrarVisor();
    }
}

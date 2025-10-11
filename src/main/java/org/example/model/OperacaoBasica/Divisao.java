package org.example.model.OperacaoBasica;

import org.example.model.Calculadora;

public class Divisao extends Calculadora {

    public Divisao() {}

    public Divisao(Calculadora calc) {
        this.valorAtual = calc.getValorAtual();
    }

    @Override
    public void operar(double valor) {
        if (valor == 0) {
            System.out.println("❌ Erro: divisão por zero!");
            return;
        }

        if (!temValor()) valorAtual = valor;
        else valorAtual /= valor;

        mostrarVisor();
    }
}

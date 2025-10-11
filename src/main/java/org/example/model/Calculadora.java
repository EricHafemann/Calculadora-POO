package org.example.model;

public abstract class Calculadora {
    protected double valorAtual = Double.NaN; // começa sem valor definido

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void zerar() {
        valorAtual = Double.NaN;
    }

    public boolean temValor() {
        return !Double.isNaN(valorAtual);
    }

    public void mostrarVisor() {
        if (Double.isNaN(getValorAtual()))
        {
            System.out.println("------------------------");
            System.out.println("   CALCULADORA ZERADA   ");
            System.out.println("------------------------");
        }
        else {
            System.out.println("-----------------------");
            System.out.println("Valor atual: " + (Double.isNaN(valorAtual) ? "Sem valor" : valorAtual));
            System.out.println("-----------------------");
        }
    }

    public abstract void operar(double valor);
}

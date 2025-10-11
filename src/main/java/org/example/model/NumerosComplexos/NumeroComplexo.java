package org.example.model.NumerosComplexos;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public NumeroComplexo soma(NumeroComplexo outro) {
        return new NumeroComplexo(this.real + outro.real, this.imaginario + outro.imaginario);
    }

    public NumeroComplexo subtrai(NumeroComplexo outro) {
        return new NumeroComplexo(this.real - outro.real, this.imaginario - outro.imaginario);
    }

    public NumeroComplexo multiplica(NumeroComplexo outro) {
        double r = this.real * outro.real - this.imaginario * outro.imaginario;
        double i = this.real * outro.imaginario + this.imaginario * outro.real;
        return new NumeroComplexo(r, i);
    }

    public NumeroComplexo divide(NumeroComplexo outro) {
        double divisor = Math.pow(outro.real, 2) + Math.pow(outro.imaginario, 2);
        if (divisor == 0) throw new ArithmeticException("Divisão por zero em número complexo");
        double r = (this.real * outro.real + this.imaginario * outro.imaginario) / divisor;
        double i = (this.imaginario * outro.real - this.real * outro.imaginario) / divisor;
        return new NumeroComplexo(r, i);
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    public NumeroComplexo conjugado() {
        return new NumeroComplexo(real, -imaginario);
    }

    @Override
    public String toString() {
        if (imaginario >= 0)
            return String.format("%.2f + %.2fi", real, imaginario);
        else
            return String.format("%.2f - %.2fi", real, Math.abs(imaginario));
    }
}

package org.example.view;

import org.example.Ferramentas.Cls;
import org.example.Ferramentas.Delay;
import org.example.Ferramentas.Leitor;
import org.example.model.Calculadora;
import org.example.model.NumerosComplexos.OperacoesComplexas;
import org.example.model.OperacaoBasica.*;
import org.example.model.OperacoesAvancada.*;
import org.example.model.Algebra.*;
import org.example.model.Teoria.*;
import org.example.model.Trigonometria.Trigonometria;
import org.example.model.Conversoes.*;
import org.example.model.OperacoesAvancada.RaizQuadrada;

import java.util.InputMismatchException;

public class MenuPrincipal {

    public static Calculadora calc = new Soma();

    // Cores
    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String ROXO = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";

    // Utilitários
    public static final Delay Delay = new Delay();
    public static final Leitor LEITOR = new Leitor();
    public static final Cls CLS = new Cls();

    public static void exibir() {
        boolean fim = false;
        int opMenu;

        do {
            CLS.limpa(10);
            System.out.println(AZUL + "- - - - - - - - - - - - - - - - - -" + RESET);
            System.out.println(CIANO + "        CALCULADORA TOP        " + RESET);
            System.out.println(AZUL + "- - - - - - - - - - - - - - - - - -\n" + RESET);
            calc.mostrarVisor();
            System.out.println("\n" + ROXO + "ESCOLHA A OPÇÃO DESEJADA:\n" + RESET);


            System.out.println("[0]  - LIMPAR CALCULADORA                    [5]  - RAIZ QUADRADA");
            System.out.println("[1]  - SOMAR                                 [6]  - POTÊNCIA");
            System.out.println("[2]  - SUBTRAIR                              [7]  - FATORIAL");
            System.out.println("[3]  - MULTIPLICAR");
            System.out.println("[4]  - DIVIDIR");

            System.out.println();
            System.out.println("[8]  - EQUAÇÃO DE 1º GRAU                   [10] - MMC");
            System.out.println("[9]  - EQUAÇÃO DE 2º GRAU                   [11] - MDC");
            System.out.println("                                            [12] - MÓDULO");
            System.out.println();

            System.out.println("[13] - SENO                                 [17] - CONVERSÃO DE ARMAZENAMENTO");
            System.out.println("[14] - COSSENO                              [18] - CONVERSÃO DE REDE");
            System.out.println("[15] - TANGENTE                             [19] - CONVERSÃO DE PROCESSAMENTO");
            System.out.println("[16] - CONVERSÃO DE TEMPO                   [20] - OPERAÇÕES COM NÚMEROS COMPLEXOS");
            System.out.println("[21] - ARREDONDAR");

            System.out.println();
            System.out.println("[99] - SAIR");


            try {
                System.out.print("\n: ");
                opMenu = LEITOR.lInt();
                LEITOR.lString();

                CLS.limpa(5);

                switch (opMenu) {
                    // Operações básicas
                    case 0 -> zerar();
                    case 1 -> operar(new Soma(calc), "Soma");
                    case 2 -> operar(new Subtracao(calc), "Subtração");
                    case 3 -> operar(new Multiplicacao(calc), "Multiplicação");
                    case 4 -> operar(new Divisao(calc), "Divisão");

                    // Matemática avançada
                    case 5 -> RaizQuadrada.executar(calc);
                    case 6 -> Potenciacao.executar(calc);
                    case 7 -> Fatorial.executar(calc);

                    // Equações
                    case 8 -> Equacao1Grau.resolver();
                    case 9 -> Equacao2Grau.resolver();

                    // Teoria dos números
                    case 10 -> MMC.executar();
                    case 11 -> MDC.executar();
                    case 12 -> Modulo.executar();

                    // Trigonometria
                    case 13 -> Trigonometria.seno();
                    case 14 -> Trigonometria.cosseno();
                    case 15 -> Trigonometria.tangente();

                    // Conversões
                    case 16 -> Tempo.executar();
                    case 17 -> Armazenamento.executar();
                    case 18 -> Rede.executar();
                    case 19 -> Processamento.executar();

                    // Numeros Complexos
                    case 20 -> OperacoesComplexas.executar();

                    // Arredondar
                    case 21 -> calc.setValorAtual(Math.round(calc.getValorAtual()));

                    // Termina a Calculadora
                    case 99 -> {
                        System.out.println(VERDE + "\nEncerrando calculadora..." + RESET);
                        Delay.time(1000);
                        fim = true;
                    }

                    default -> {
                        System.out.println(VERMELHO + "Opção inválida!" + RESET);
                        Delay.time(1000);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("\n-- Digite apenas números --\n");
                LEITOR.lString();
                Delay.time(1500);
            }
        } while (!fim);
    }

    private static void operar(Calculadora operacao, String nome) {
        System.out.print(AMARELO + "Valor " + nome + " : " + RESET);
        try {
            double valor = LEITOR.lDouble();
            LEITOR.lString();

            operacao.operar(valor);
            CLS.limpa(20);
            calc = operacao;

            operacao.mostrarVisor();
            System.out.println();

        } catch (InputMismatchException e) {
            System.err.println("\n-- Digite apenas números --\n");
            LEITOR.lString();
            Delay.time(1500);
        }
    }

    private static void zerar() {
        if (calc != null) {
            calc.zerar();
            System.out.println(VERDE + "-- Calculadora Zerada --\n" + RESET);
        } else {
            System.out.println(VERMELHO + "Nenhuma calculadora ativa para zerar." + RESET);
        }
        Delay.time(1000);
    }
}

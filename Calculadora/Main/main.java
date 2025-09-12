package Main;

import Operacao.*;

// Import Classes de outros Pacotes
import Operacao.Calculadora;
import Operacao.Soma;
import Operacao.Subtração;
import OperacaoDiversas.Fatorial;
import OperacaoDiversas.MMC;
import OperacaoDiversas.MDC;
import OperacaoDiversas.Módulo;
import OperacaoDiversas.Potencia;
import OperacaoDiversas.Raiz;
import Operacao.Multiplicação;
import Operacao.Divisão;
import Utilidades.Utility;

public class main {

    static Calculadora calculadora = new Calculadora();
    public static void main(String[] args) {
            
        menuCalculadora();
    }

    public static void menuCalculadora ()
    {

        int opMenu = 0;
        boolean fimCalculadora = false;


        do 
        {

            System.out.println("-- Calculadora Modular --\n");

            if (calculadora.isPossuiResultado())
            {
                calculadora.exibirResultado();
            }

            else
            {
                System.out.println("  ----------------------");
                System.out.println("            "+"          ");
                System.out.println("  ----------------------\n");
            }


            System.out.println("[1] - Soma");
            System.out.println("[2] - Subtrair");
            System.out.println("[3] - Multiplicar");
            System.out.println("[4] - Dividir");
            System.out.println("[5] - Raiz Quadrada");
            System.out.println("[6] - Potencia");
            System.out.println("[7] - Fatorial");
            System.out.println("[8] - Módulo (valor absoluto)");
            System.out.println("[9] - MMC (Mínimo Múltiplo Comum)");
            System.out.println("[10] - MDC (Máximo Divisor Comum)");
            System.out.println("[11] - Zerar Calculadora");
            System.out.println("[12] - Fechar Calculadora");
            

            opMenu = Utility.lerInt();
            Utility.leString();

            switch (opMenu) 
            {
                case 1:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        calculadora.solicitarNumeros();
                        Soma.SomarAdicional(calculadora);
                        Utility.Cls(20);
                    }
                    else
                    {
                        calculadora.solicitarNumeros();
                        Soma.Somar(calculadora);
                        calculadora.setPossuiResultado(true);
                        Utility.Cls(20);
                    }
                    break;
                }
                case 2:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        calculadora.solicitarNumeros();
                        Subtração.SubtrairAdicional(calculadora);
                        Utility.Cls(20);
                    }
                    else
                    {
                        calculadora.solicitarNumeros();
                        Subtração.Subtrair(calculadora);
                        calculadora.setPossuiResultado(true);
                        Utility.Cls(20);
                    }
                    break;
                }
                case 3:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        calculadora.solicitarNumeros();
                        Multiplicação.MultiplicarAdicional(calculadora);
                        Utility.Cls(3);
                    }
                    else
                    {
                        calculadora.solicitarNumeros();
                        Multiplicação.Multiplicar(calculadora);
                        calculadora.setPossuiResultado(true);
                        Utility.Cls(20);
                    }
                    break;
                }
                case 4:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        calculadora.solicitarNumeros();
                        if (calculadora.getNumeroAdicional() == 0)
                        {
                            System.out.println("\n-- Multiplicação por 0 resulta em Indefinido --");
                            calculadora.setPossuiResultado(false);
                            calculadora.setResultadoAtual(Double.NaN);
                            Utility.Delay(3000);
                            Utility.Cls(3);
                        }
                        else
                        {
                            Divisão.DividirAdicional(calculadora);
                            Utility.Cls(20);
                        }
                        

                        
                    }
                    else
                    {
                        if (calculadora.getNumeroAdicional() == 0)
                        {
                            System.out.println("\n-- Multiplicação por 0 resulta em Indefinido --");
                            calculadora.setPossuiResultado(false);
                            calculadora.setResultadoAtual(Double.NaN);
                            Utility.Delay(3000);
                            Utility.Cls(2);
                        }
                        else
                        {
                            Divisão.Dividir(calculadora);
                            Utility.Cls(20);
                        }
                    }
                    break;
                }
                case 5:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        Raiz.descobrirRaiz(calculadora);
                        Utility.Cls(15);
                    }        
                    else
                    {
                        calculadora.setOperacaoDiversas(true);
                        calculadora.solicitarNumeros();
                        Raiz.descobrirRaiz(calculadora);
                        Utility.Cls(15);
                        calculadora.setOperacaoDiversas(false);
                        calculadora.setPossuiResultado(true);
                    }       
                    
                    break;
                }
                case 6:
                {
                    calculadora.setPotencia(true);

                    if (calculadora.isPossuiResultado())
                    {

                        calculadora.solicitarNumeros();
                        Potencia.calcularFatorial(calculadora.getValorExpoente(), calculadora);
                        Utility.Cls(15);
                    }

                    else
                    {
                        calculadora.solicitarNumeros();
                        Potencia.calcularFatorial(calculadora.getValorExpoente(), calculadora);
                        Utility.Cls(15);
                    }
                    calculadora.setPossuiResultado(true);
                    calculadora.setPotencia(false);
                    break;
                }
                case 7:
                {
                    if (calculadora.isPossuiResultado())
                    {
                        Fatorial.calcularFatorial(calculadora);
                        Utility.Cls(15);
                    }
                    else
                    {
                        System.out.println("Digite um número: ");
                        double numero = Utility.lerDouble();
                        Utility.leString();

                        calculadora.setResultadoAtual(numero);
                        Fatorial.calcularFatorial(calculadora);
                        Utility.Cls(15);
                        calculadora.setPossuiResultado(true);
                    }
                    break;
                }
                case 8:
                {
                    Módulo.calcularModulo(calculadora);
                    Utility.Cls(15);
                    break;
                }
                
                case 9:
                {
                    MMC.calcularMMC(calculadora);
                    Utility.Cls(20);
                    break;
                }
                case 10:
                {
                    MDC.calcularMDC(calculadora);
                    Utility.Cls(20);
                    break;
                }
                case 11:
                {
                    calculadora.setResultadoAtual(0);
                    calculadora.setPossuiResultado(false);
                    System.out.println("\n-- Calculadora Zerada --\n");
                    Utility.Delay(4000);
                    Utility.Cls(20);
                    break;
                }
                case 12:
                {
                    Utility.Cls(15);
                    System.out.println("-- FIM DA CALCULADORA --\n");
                    for (int i = 0; i < 3; i++) 
                    {
                        System.out.print(".");
                        Utility.Delay(1000);
                    }
                    System.exit(0);
                    break;
                }
                default:
                {
                System.out.println("\n\n-- Opção Inválida --\n\n");
                Utility.Delay(3000);
                break;
                }
            }

        }while(!fimCalculadora);
    }
}


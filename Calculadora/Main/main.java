package Main;

import Conversao.Armazenamento;
import Conversao.Processamento;
import Conversao.Tempo;
import Conversao.VelocidadeRede;

// Import Classes de outros Pacotes
import Operacao.Calculadora;
import Operacao.Soma;
import Operacao.Subtração;
import OperacaoDiversas.*;
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
            System.out.println("[11] - Calcular Equação 1° Grau");
            System.out.println("[12] - Calcular Equação 2° Grau");
            System.out.println("[13] - Calcular (Seno | Cosseno | Tangente)");
            System.out.println("[14] - Menu de Conversões");
            System.out.println("[15] - Zerar Calculadora");
            System.out.println("[16] - Fechar Calculadora");
            

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
                    System.out.println("Digite o valor de (a): ");
                    int a = Utility.lerInt();
                    Utility.leString();

                    System.out.println("\nDigite o valor de (b): ");
                    int b = Utility.lerInt();
                    Utility.leString();

                    CalcularEquacao.calcularEquacao(calculadora, a, b);
                    break;
                }
                
                case 12:
                {
                    System.out.println("Digite o valor de (a): ");
                    int a = Utility.lerInt();
                    Utility.leString();

                    System.out.println("\nDigite o valor de (b): ");
                    int b = Utility.lerInt();
                    Utility.leString();

                    System.out.println("\nDigite o valor de (c): ");
                    int c = Utility.lerInt();
                    Utility.leString();

                    CalcularEquacao2.calcularEquacao2(calculadora,a,b,c);
                    break;
                }

                case 13:
                {
                    System.out.println("Digite o valor do ângulo: ");
                    double angulo = Utility.lerDouble();
                    Utility.leString();

                    Trigonometria.calcularTrigonometria(1);
                    break;

                }
                case 14:
                {
                    menuConversao();
                    break;
                }
                case 15:
                {
                    calculadora.setResultadoAtual(0);
                    calculadora.setPossuiResultado(false);
                    System.out.println("\n-- Calculadora Zerada --\n");
                    Utility.Delay(4000);
                    Utility.Cls(20);
                    break;
                }
                case 16:
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

    private static void menuConversao() {

        Utility.Cls(20);
        System.out.println("-- Formas de Conversões --");

        System.out.println("\nEscolha uma opção de conversão: ");
        System.out.println("{ Tempo }");
        System.out.println("[1] - Segundos -> Minutos");
        System.out.println("[2] - Horas -> Segundos");
        System.out.println("{ Armazenamento }");
        System.out.println("[3] - Bytes -> KB");
        System.out.println("[4] - KB -> MB");
        System.out.println("[5] - GB -> MB");
        System.out.println("[6] - TB -> GB");
        System.out.println("{ Velocidade de Rede }");
        System.out.println("[7] - Mbps -> MB");
        System.out.println("[8] - Gbps -> Mbps");
        System.out.println("{ Processamento }");
        System.out.println("[9] - GHz -> MHz");
        System.out.println("[10] - MHz -> GHz");
        System.out.println("[11] - Voltar ao Menu Principal");

        int op = Utility.lerInt();
        Utility.leString();

        switch (op)
        {
            case 1:
            {
                Tempo.SegundoParaMinuto(calculadora);
                menuConversao();
                break;
            }
            case 2:
            {
                Tempo.horaParaSegundo(calculadora);
                menuConversao();
                break;
            }
            case 3:
            {
                Armazenamento.bytesParaKb(calculadora);
                menuConversao();
                break;
            }
            case 4:
            {
                Armazenamento.kbParaMb(calculadora);
                menuConversao();
                break;
            }
            case 5:
            {
                Armazenamento.gbParaMb(calculadora);
                menuConversao();
                break;
            }
            case 6:
            {
                Armazenamento.tbParaGb(calculadora);
                menuConversao();
                break;
            }
            case 7:
            {
                VelocidadeRede.mbpsParaMBs(calculadora);
                menuConversao();
                break;
            }
            case 8:
            {
                VelocidadeRede.gbpsParaMbps(calculadora);
                menuConversao();
                break;
            }
            case 9:
            {
                Processamento.ghzParaMHz(calculadora);
                menuConversao();
                break;
            }
            case 10:
            {
                Processamento.mhzParaGhz(calculadora);
                menuConversao();
                break;
            }
            case 11:
            {
                menuCalculadora();
                break;
            }
            default:
            {
                System.out.println("-- Opção Inválida --");
                Utility.Delay(2000);
                Utility.Cls(20);
                menuCalculadora();
            }
        }

    }
}


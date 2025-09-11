package Utilidades;

import java.util.Scanner;

public abstract class Utility {
    
    private static Scanner S = new Scanner(System.in);

    public static void Delay (int tempoDelay)
    {
        try
        {
        Thread.sleep(tempoDelay);
        }
        catch (Exception e)
        {
        System.out.println("Ocorreu um erro no delay: "+e.getMessage());
        }
    }

    public static int lerInt ()
    {
        return S.nextInt();
    } 

    public static String leString ()
    {
        return S.nextLine();
    }

    public static double lerDouble ()
    {
        return S.nextDouble();
    }
    
    public static void Cls (int numeroLinhas)
    {
        for (int i = 0; i < numeroLinhas; i++) {
            System.out.println("");
        }
    }
    
}

package org.example.Ferramentas;

import java.util.Scanner;

public class Leitor {

    static Scanner S = new Scanner(System.in);

    public String lString ()
    {
        return S.nextLine();
    }

    public int lInt()
    {
        return S.nextInt();
    }

    public double lDouble ()
    {
        return S.nextDouble();
    }
}

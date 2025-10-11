package org.example.Ferramentas;

public class Delay {

    public void time (int tempoDelay)
    {
        try
        {
            Thread.sleep(tempoDelay);
        }
        catch (InterruptedException e)
        {
            System.err.println("Ocorreu um erro no Delay: "+e.getMessage());
        }

    }
}

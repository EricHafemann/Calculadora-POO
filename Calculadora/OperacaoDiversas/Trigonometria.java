package OperacaoDiversas;

public class Trigonometria {

    public static void calcularTrigonometria(double anguloGraus) {

        double anguloRadianosS = Math.toRadians(anguloGraus);
        double seno = Math.sin(anguloRadianosS);

        double anguloRadianosC = Math.toRadians(anguloGraus);
        double cosseno = Math.cos(anguloRadianosC);

        double anguloRadianosT = Math.toRadians(anguloGraus);
        double tangente = Math.tan(anguloRadianosT);

        System.out.println("\n\n-- Resultados do Ângulo de "+anguloGraus+" °G : --");
        System.out.println("Seno de "+anguloGraus+"°G : "+seno);
        System.out.println("Cosseno de "+anguloGraus+"°G : "+cosseno);
        System.out.println("Tangente de "+anguloGraus+"°G : "+tangente);
    }



}

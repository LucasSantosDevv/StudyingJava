package Fundamentos.Desafios;

public class ZDesafioVariavel {
    static void main(String[] args) {

        // Fahrenheit para Celcius

        double ºF = 68;
        final double trintaedois = 32;
        final double cinconove = 5.0 / 9.0;

    double ºC = (ºF - trintaedois) * cinconove;

    System.out.println("ºC = " + ºC);

    ºF = 100;
    ºC= (ºF - trintaedois) * cinconove;

    System.out.println("°C = " + ºC);

        // Celcius para Fahrenheit

        final double umoito = 1.8;
        final double trintadois = 32;
        double C = 20;

    double F = (C * umoito) + trintadois;

    System.out.println("ºF = " + F);

    C = 37;
    F = (C * umoito) + trintadois;

    System.out.println("ºF = " + F);
    }
}

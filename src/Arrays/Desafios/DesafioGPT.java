package Arrays.Desafios;

//Desafio matriz

import java.util.Scanner;

public class DesafioGPT {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


            System.out.println("_____ Média das temperaturas _____");

            System.out.println("\nQuantos dias foram feitas as medições?");
            int dias = entrada.nextInt();

            System.out.println("\n Quantas medições foram feitas?");
            int medicoes = entrada.nextInt();

        double[][] temperatura = new double[dias][medicoes];

        double mediaDia = 0;
        double mediaTotal = 0;

        for (int a = 0; a < dias; a++){
            System.out.println("\nDia" + (a + 1));
            double somaDia = 0;

            for (int b = 0; b < medicoes; b++){
                System.out.println("Temperatura " + (b + 1) + ":");
                temperatura [a][b] = entrada.nextDouble();
                somaDia += temperatura[a][b];
                mediaDia = somaDia / medicoes;
            }
            mediaTotal += mediaDia / dias;
            System.out.printf("A média do dia foi de: %.2fºC\n", mediaDia);
        }
        System.out.printf("\nA média dos dias foi de: %.2fºC", mediaTotal);
    }
}

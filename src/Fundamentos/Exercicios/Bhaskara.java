package Fundamentos.Exercicios;

import java.util.Scanner;

public class Bhaskara {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o valor de A: ");
        String valora = entrada.nextLine().replace(",",".");
        double valorA = Double.parseDouble(valora);

        System.out.println("insira o valor de B: ");
        String valorb = entrada.nextLine().replace(",",".");
        double valorB = Double.parseDouble(valorb);

        System.out.println("insira o valor de C: ");
        String valorc = entrada.nextLine().replace(",",".");
        double valorC = Double.parseDouble(valorc);

        double delta = Math.pow(valorB,2) -4 * valorA *valorC;
        double deltaRaiz = Math.sqrt(delta);
        if (delta < 0){
            System.out.println("Delta tem valor negativo, sem raízes reais");}

        double superiorMais = (-valorB + deltaRaiz) / (valorA*2);
        double superiorMenos = (-valorB - deltaRaiz) / (valorA*2);

        System.out.println("X1 = " + superiorMais);
        System.out.println("X2 = " + superiorMenos);

    }
}

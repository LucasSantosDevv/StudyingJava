package Fundamentos.Exercicios;

import java.util.Scanner;

public class IMC {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua altura: (Exemplo: 1,70m)");
        String altura1 = entrada.nextLine().replace(",",".");
        double alturaUM = Double.parseDouble(altura1);

        System.out.println("Insira seu peso: (Exemplo: 70,5kg)");
        String peso1 = entrada.nextLine().replace(",",".");
        double pesoUM = Double.parseDouble(peso1);

        double calculo = Math.pow(alturaUM,2);
        double resultado = pesoUM / calculo;

        System.out.printf("Seu IMC é: %.2f", resultado);

        entrada.close();

    }
}

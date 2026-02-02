package Fundamentos.Exercicios;

import java.util.Scanner;

public class Temperatura {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual temperatura deseja converter? (F = Fahrenheit C = Celcius");
        String temperatura = entrada.nextLine().toUpperCase();

        System.out.println("qual a temperatura: ");
        String temp = entrada.nextLine().replace(",",".");
        double temp1 = Double.parseDouble(temp);

        double conversao = "C".equals(temperatura) ? temp1 * 1.8 + 32 : 0;
        conversao = "F".equals(temperatura) ? (temp1 - 32) * 0.555 : conversao;

        System.out.printf("A temperatura convertida é: \n%.2f ", conversao);

        entrada.close();
    }
}

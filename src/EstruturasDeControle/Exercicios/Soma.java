package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Soma {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double soma = 0;

        while (true){
            System.out.println("Insira os números (ou qualquer negativo para finalizar)\n");
            String NUMEROS = entrada.nextLine().toLowerCase().replace(",",".");

            double numeros = Double.parseDouble(NUMEROS);
            if(numeros < 0){
                break;
            }

            if(numeros >= 0){
                soma += numeros;
            }
        }
        System.out.println("\nA soma foi igual a: " + soma);
        entrada.close();
    }
}

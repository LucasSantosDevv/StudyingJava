package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class ParOuImpar {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nInsira um número inteiro entre 0 e 100 (ou -1 para finalizar)");
            int numero = entrada.nextInt();
            if(numero == -1){
                break;
            }else if (numero < 0 || numero > 100) {
                System.out.println("\nPor favor insira um número válido");
                continue;
            }
            var b = numero % 2;

            if (b == 1) {
                System.out.println("O número é ímpar");
            } else {
                System.out.println("O número é par");
            }
        }
        entrada.close();
    }
}

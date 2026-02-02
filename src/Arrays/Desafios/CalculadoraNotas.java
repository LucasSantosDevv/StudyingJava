package Arrays.Desafios;

/*DESAFIO: criar um sistema que pergunte "quantas notas deseja inserir" e depois com base nisso use o sistema de array
para armazenar as notas inseridas e calcular a média
 */

import java.util.Scanner;

public class CalculadoraNotas {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeNotas;
        System.out.println("---------------------- Calculadora de notas ----------------------\n");

        while (true) {
            System.out.println("Quantas notas deseja inserir?");
            String QUANTIDADENOTAS = entrada.nextLine();
            while (true) {
                if (QUANTIDADENOTAS == "") {
                    System.out.println("Quantas notas deseja inserir?");
                    QUANTIDADENOTAS = entrada.nextLine();
                } else {
                    break;
                }
            }
            quantidadeNotas = Integer.parseInt(QUANTIDADENOTAS);

            if(quantidadeNotas > 0){
                break;
            }else{
                System.out.println("Por favor insira um número válido");
            }

        }
        double [] notas = new double[quantidadeNotas];

        for(int a = 0; a < quantidadeNotas; a++){
            System.out.println("\nInsira a nota:");
            String NOTA = entrada.nextLine().replace(",",".");
           while (true) {
               if (NOTA == "") {
                   System.out.println("\nInsira a nota:");
                   NOTA = entrada.nextLine().replace(",",".");
               } else {
                   break;
               }
           }
            double nota = Double.parseDouble(NOTA);
            System.out.println("Nota: " + nota);

            notas[a] = nota;
        }

        double somaResultado = 0;

        for(double soma : notas){
            somaResultado += soma;
        }
            System.out.printf("\nA média do aluno foi de: %.2f", somaResultado / quantidadeNotas);
    }
}

package Fundamentos.Desafios;

/*Desafio: criar um 'scanner' para o utilizador inserir seus últimos três salários sendo obrigatório a aceitação de
números com vírgula e não apenas ponto, converter para numeral e fazer a soma e a médias dos mesmos*/

import java.util.Scanner;

public class ZDesafioConversao {
    static void main(String[] args) {

        System.out.println("Insira seus últimos pagamentos");

        Scanner ler = new Scanner(System.in);

        System.out.println("\nPagamentos do último mês: ");
        String ultimo = ler.nextLine().replace(",",".");

        System.out.println("\nPagamento do penúltimo mês: ");
        String penultimo = ler.nextLine().replace(",",".");

        System.out.println("\nPagamento do antepenúltimo mês: ");
        String antepenultimo = ler.nextLine().replace(",",".");

        double um = Double.parseDouble(ultimo);
        double dois = Double.parseDouble(penultimo);
        double tres = Double.parseDouble(antepenultimo);

        double soma = um + dois + tres;

        System.out.println("\nSeu montante é de: " + soma);
        System.out.println("Sua média salarial foi de: " + soma / 3);

        ler.close();
    }
}

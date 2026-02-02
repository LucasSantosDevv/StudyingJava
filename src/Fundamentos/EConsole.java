package Fundamentos;

//Aula base de como adicionar entrada de informações no sistema através do "Import java.util.Scanner"

import java.util.Scanner;

public class EConsole {
    static void main(String[] args) {

        System.out.print("Insira seus dados\n\n");

        Scanner entrada = new Scanner(System.in); //Comando base para o sistema começar a receber dados externos
        System.out.print("Nome: ");               //Comando para o sistema mostrar a entrada que será recebida
        String nome = entrada.nextLine();         //Comando para criar "campo" de preenchimento

        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("Pretensão salarial: ");
        double salario = entrada.nextDouble();

        entrada.close();

        System.out.printf("\n%s %s tem %d anos com pretensão salarial de R$%.2f",
                nome, sobrenome, idade, salario);

    }
}
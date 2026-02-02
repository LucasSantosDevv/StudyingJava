package Fundamentos;

//Operadores ternários são operadores que lidam com expressões condicionais de forma mais limitada que o "if"

import java.util.Scanner;

public class KOperadoresTernarios {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double notaDireto = 6;
        double notaRecuperacao = 5;

        System.out.println("Insira a nota: (0 a 10) ");
        String nota1 = entrada.nextLine().replace(",",".");
        double notaUm = Double.parseDouble(nota1);
        String aluno1Parcial = notaUm >= notaRecuperacao ? "Recuperação" : "Reprovado";
        String aluno1Final = notaUm >= notaDireto ? "Aprovado" : aluno1Parcial;

        System.out.println("Status: " + aluno1Final);

        entrada.close();




    }
}


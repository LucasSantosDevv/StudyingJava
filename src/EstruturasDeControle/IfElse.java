package EstruturasDeControle;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota: (0 a 10)");
        String NOTA = entrada.nextLine().replace(",",".");
        double nota = Double.parseDouble(NOTA);

        if(nota > 10 || nota < 0){
            System.out.println("Insira uma nota válida");
        }else if (nota >= 9.5){
            System.out.println("A+");
        }else if (nota >= 9.0) {
            System.out.println("A");
        }else if (nota >= 8.5) {
            System.out.println("B+");
        }else if (nota >= 8.0) {
            System.out.println("B");
        }else if (nota >=7.5) {
            System.out.println("C+");
        }else if (nota >= 7.0) {
            System.out.println("C");
        }else if (nota >= 6.5) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        entrada.close();
        }

    }


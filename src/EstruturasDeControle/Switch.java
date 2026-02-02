package EstruturasDeControle;

/*O uso do 'switch' é muito útil em diversos cenários, funciona de forma mais orgânica do que usar if com vários
else if's  */

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double total = 0;
        int quantidade = 0;

        while (true) {
            System.out.println("Insira a nota: (ou '.' para continuar)");
            String NOTAS = entrada.nextLine().replace(",", ".");

            if (NOTAS.equals(".")) {
                break;
            }
            double notas = Double.parseDouble(NOTAS);

            if (notas >= 0 && notas <= 10) {
                total += notas;
                quantidade++;
            } else {
                System.out.println("Insira uma nota válida");
            }
        }

            double MEDIA = total / quantidade;
            int media = (int) MEDIA;

            String conceito = "";       //Criação de uma 'string' para os cases
            switch(media){      //Abertura do 'switch' em cima da 'int' média
                case 10:        //primeiro case
                    conceito = "A+";
                    break;
                case 9:
                    conceito = "A";
                    break;
                case 8:
                    conceito = "B";
                    break;
                case 7:
                    conceito = "C";
                    break;
                case 6:
                    conceito = "D";
                    break;
                default:
                    conceito = "F";
            }
            System.out.println(conceito);

        entrada.close();
    }
}

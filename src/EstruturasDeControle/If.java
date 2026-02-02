package EstruturasDeControle;

import java.util.Scanner;

public class If {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a média do 1º trimestre: (0 a 10) ");
        String nota1 = entrada.nextLine().replace(",",".");
        double notaUM = Double.parseDouble(nota1);

        System.out.println("Insira a média do 2º trimestre: (0 a 10) ");
        String nota2 = entrada.nextLine().replace(",",".");
        double notaDOIS = Double.parseDouble(nota2);

        System.out.println("Insira a média do 3º trimestre: (0 a 10) ");
        String nota3 = entrada.nextLine().replace(",",".");
        double notaTRES = Double.parseDouble(nota3);

        double media = (notaUM + notaDOIS + notaTRES) / 3;
        System.out.printf("Nota final: %.2f  ", media);

        if(media >= 5 && media <= 6.9){
            System.out.println("Status: Recuperação");
        }
        if(media >= 7){
            System.out.println("Status: Aprovado");
        }
        if(media < 5){
            System.out.println("Status: Reprovado");
        }

        entrada.close();
    }
}

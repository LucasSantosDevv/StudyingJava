package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Adivinhacao {
    static void main(String[] args) {

        System.out.println("Bem vindo ao jogo da adivinhação, tente acertar o número\n" +
                "que estou pensando (entre 0 e 100), mas cuidado, tem apenas 10 chances");

        int a = 56;

        Scanner entrada = new Scanner(System.in);

        for(int tentativas = 1; tentativas <= 10; tentativas++) {
            System.out.println("\n\nFaça seu chute");
            int um = entrada.nextInt();

            if (um < 0 || um > 100){
                System.out.println("Por favor, insira um número válido");
                tentativas--;
                continue;
            }

            if (um > a) {
                System.out.println("Uhhhh, não foi dessa vez, tente um pouco mais BAIXO");
                System.out.println("Foram  " + tentativas + " tentativa(s)");
            } else if (um < a) {
                System.out.println("Uhhhh, não foi dessa vez, tente um pouco mais ALTO");
                System.out.println("Foram " + tentativas + " tentativa(s)");
            } else {
                System.out.println("PARABÉNS, você acertou !!!");
                break;
            }
            if (tentativas == 10){
                System.out.println("\nO número secreto era " + a);
                break;
            }
        }
        entrada.close();
    }
}

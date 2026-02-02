package Arrays.Desafios;

import java.util.Scanner;

public class ClassificacaoPalavras2 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] palavras;

        while (true) {
            IO.println("----- Contador de Palavras -----");
            IO.println("Quantas palavras deseja inserir?");

            if(entrada.hasNextInt()) {
                int quantidade = entrada.nextInt();
                palavras = new String[quantidade];
                entrada.nextLine();
                break;
            }else{
                IO.println("Inválido, digite apenas números");
            }
        }

        for (int i = 0; i < palavras.length; i++) {
            IO.println("Por favor insira a " + (i + 1) + " palavra");
            palavras[i] = entrada.nextLine();
        }

        int contagem = 1;
        int letrasPalavras = 0;

        for(String a : palavras){
            IO.println("\nPalavra " + contagem + " é: " + a);
            contagem++;

            for(int i = 0; i < a.length(); i++){
                letrasPalavras++;
            }
            IO.println("O total de letras é: " + letrasPalavras);
            letrasPalavras = 0;
            char letraIncial = a.charAt(0);
            char letraFinal = a.charAt(a.length() - 1);

            IO.println("Primeira letra: " + letraIncial);
            IO.println("Última letra: " + letraFinal);
        }
        entrada.close();
    }
}

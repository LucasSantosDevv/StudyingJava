package Excecoes;

import classe.Objeto;
import java.util.Scanner;

public class Conceitos {

    public static void imprimir(Objeto objeto){
        IO.println(objeto.nome);
    }

    static void main(String[] args) {
        Objeto a1 = new Objeto("Lápis");
        Objeto a2 = null;

        imprimir(a1);
      //imprimir(a2); (Não funcionaria porque o metodo não consegue lidar com valor nulo)

        try {
            imprimir(a2);                   //Tenta executar o metodo
        }catch (Exception excecao){         //Se não consegue executar "siga a baixo"
            IO.println("houve um erro");
        }

//_________________________________________________________________________________________________________________
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[2];

        for(int i = 0; i< numeros.length; i++){
            IO.println("\nInsira um número");
            try {
                numeros[i] = entrada.nextInt();
            } catch (Exception teste){
                IO.println("Ocorreu um erro por que você não sabe seguir instruções");
            }
            entrada.nextLine();
        }
        int divisao = 0;

        try {
             divisao = numeros [0] / numeros [1];
        }catch (Exception dontDoIt){
             divisao = numeros [0] / 1;
        }
        IO.println(divisao);
        entrada.close();
    }
}

package Lambdas.InterfacesFuncionais.Desafios;

/* Desafio: Classificação e ação com Consumer
Requisitos:
1. Leia 3 números inteiros do console.
2. Armazene em um array int[].
3. Crie Consumers separados para:
 - imprimir o número
 - informar se é par ou ímpar
Restrições:
 - Não use if no main para imprimir mensagens.
 - Toda a lógica de ação deve estar dentro dos Consumers.
 - Não use Stream (for / foreach apenas).                                                                           */

import java.util.Scanner;
import java.util.function.Consumer;

public class DesafioConsumer {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros;

        while (true) {
            IO.println("Quantos números deseja inserir?");

            if(!entrada.hasNextInt()){
                IO.println("Por favor insira um número inteiro");
                entrada.nextLine();
                continue;
            }
            int tamanhoArray = entrada.nextInt();
            entrada.nextLine();

            if(tamanhoArray <= 0){
                IO.println("Por favor insira um valor maior que zero");
                continue;
            }
            numeros = new int[tamanhoArray];
            break;
        }
        while (true){
            IO.println("Insira um número inteiro");

            if(!entrada.hasNextInt()){
                IO.println("Por favor insira um número inteiro");
                entrada.nextLine();
                continue;
            }
            for(int a = 0; a < numeros.length; a++){
                numeros[a] = entrada.nextInt();
                entrada.nextLine();
            }
            break;
        }
/*______________________________________________________________________________________________________________________
        Uso do consumer para executar e imprimir uma ação. (CONSUMER: representa uma função que recebe um valor e não
        retorna nada, semelhante a função 'void')
*/
        Consumer<Integer> imprimirPar = n ->
                System.out.println(n + " é par");

        Consumer<Integer> imprimirImpar = n ->
                System.out.println(n + " é ímpar");

        for(int a : numeros){
            if (a % 2 == 0) {
                imprimirPar.accept(a);
            } else {
                imprimirImpar.accept(a);
            }
        }
    }
}

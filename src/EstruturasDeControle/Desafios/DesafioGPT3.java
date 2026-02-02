package EstruturasDeControle.Desafios;

/*Crie um programa em Java que:

1. Peça para o usuário informar quantos números ele quer inserir.

2. Use um laço for para pedir esses números um por um.

3. Ao final, o programa deve exibir:

4. A soma total dos números digitados,

5. A média deles,

6. E o maior e o menor valor informados.                         */

import java.util.Scanner;

public class DesafioGPT3 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        double media = 0;

        System.out.println("Quantos números deseja inserir?");
        int quantidadeNumeros = entrada.nextInt();

        for(int a = 0; a < quantidadeNumeros; a++){
            System.out.println("Digite o número");
            double numeros = entrada.nextDouble();
            soma += numeros;
            media = soma/quantidadeNumeros;
        }
            System.out.println(soma);
            System.out.println(media);
    }

}

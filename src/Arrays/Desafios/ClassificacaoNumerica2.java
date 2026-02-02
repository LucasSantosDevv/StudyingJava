package Arrays.Desafios;

import java.util.Scanner;

public class ClassificacaoNumerica2 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] entradaNumeros;

        IO.println("----- Bem vindo a Classificadora de Números -----");

        while(true){
            IO.println("Deseja inserir quantos números?");
            String array = entrada.nextLine();

            if(!array.isBlank()){
                int tamanhoArray = Integer.parseInt(array);
                if(tamanhoArray > 0){
                    entradaNumeros = new int[tamanhoArray];
                    break;
                }else {
                IO.println("Por favor insira um valor válido");
                }
            }else{
                IO.println("Por favor insira um valor válido");
            }
        }

        int contagem = 1;

        for(int i = 0; i < entradaNumeros.length; i++) {
            IO.println("Por favor insira o " + contagem + " número");
            entradaNumeros[i] = entrada.nextInt();
            entrada.nextLine();
            contagem++;
        }

        int total = 0;
        int totalPares = 0;
        int totalImpares = 0;
        int maiorCinquenta = 0;
        int menorCinquenta = 0;
        int maior = entradaNumeros[0];
        int menor = entradaNumeros[0];

        for(int a : entradaNumeros){
            String tipo = (a % 2 == 0) ? "Par" : "Ímpar";
            String maiorMenor = (a >= 50) ? "Maior" : "Menor";
            String posNeg = (a < 0) ? "Negativo" : "Positivo";
            IO.println(a + ": " + tipo + ", "+ posNeg + ", " + maiorMenor + " do que 50");
            total += a;
            if(a % 2 == 0){
                totalPares += a;
            }
            if (a % 2 != 0){
                totalImpares += a;
            }
            if (a >= 50){
                maiorCinquenta++;
            }
            if (a < 50){
                menorCinquenta++;
            }
            if(a > maior){
                maior = a;
            }
            if(a < menor){
                menor = a;
            }
        }
        IO.println("\nA soma do valores é: " + total);
        IO.println("A soma dos pares é: " + totalPares);
        IO.println("A soma dos ímpares é: " + totalImpares);
        IO.println("A quantidade de números maiores que 50 é: " + maiorCinquenta);
        IO.println("A quantidade de números menores que 50 é: " + menorCinquenta);
        IO.println("O maior número é: " + maior);
        IO.println("O menor número é: " + menor);
        IO.println();
    }
}

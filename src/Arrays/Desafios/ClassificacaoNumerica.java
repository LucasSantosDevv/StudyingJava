package Arrays.Desafios;

import java.util.Random;

public class ClassificacaoNumerica {
    static void main(String[] args) {

        Random num = new Random(); //Uso do Ramdom
        int [] numeros = new int[20]; //Abertura do Array

        for(int preencher = 0; preencher < numeros.length; preencher++){
            numeros[preencher] = num.nextInt(101);  //Preenchimento do array com o Ramdom usando o for
        }

        int maiorNumero = 0;
        int menorNumero = 101;
        int totalPares = 0;
        int totalImpares = 0;

        for(int a : numeros){
            String par = (a % 2 == 0) ? "Par" : "Ímpar";  //Operador ternário para classificar como par ou ímpar
            String maior = (a >= 50) ? " (Maior)" : " (Menor)";     //Operador ternário para classificar como < ou > que 50
            IO.println(a + ": " + par + maior);

            if(a > maiorNumero){
                maiorNumero = a;
            }
            if(a < menorNumero){
                menorNumero = a;
            }
            if(a % 2 == 0){
                totalPares ++;
            }else{
                totalImpares ++;
            }
        }
        IO.println();
        IO.println("O maior número do array é: " + maiorNumero);
        IO.println("O menor número do array é: " + menorNumero);
        IO.println("O número de pares é: " + totalPares + "\nO número de ímpares é: " + totalImpares);
    }
}

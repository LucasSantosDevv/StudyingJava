package Fundamentos.Desafios;

import java.util.Scanner;

public class ZDesafioCalculadoraBasica {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        String valor1 = entrada.nextLine().replace(",",".");
        double valorUm = Double.parseDouble(valor1);

        System.out.println("\nInsira o segundo valor: ");
        String valor2 = entrada.nextLine().replace(",",".");
        double valorDois = Double.parseDouble(valor2);

        System.out.println("\nAgora selecione qual operação deseja realizar (+ - * /)");
        String operacao = entrada.nextLine();

        System.out.println("\n" + valorUm + operacao + valorDois);

        /*A lógica do desafio foi criar uma variável (resultado) indicando através das "" que o que vier da 'string'
    operação, através do '.equals' devera seguir um respectivo operador aritmético entre os valores da variável
    'valorUm' e 'ValorDois'. E isso foi feito através dos operadores ternários, de forma que caso o valor da operação
    não fosse reconhecido, o resultado seria zero e leria a linha de baixo, até reconhecer algum valor  */

        double resultado = "+".equals(operacao) ? valorUm + valorDois : 0;
        resultado = "-".equals(operacao) ? valorUm - valorDois : resultado;
        resultado = "*".equals(operacao) ? valorUm * valorDois : resultado;
        resultado = "/".equals(operacao) ? valorUm /valorDois : resultado;

        System.out.println("= " + resultado);

        entrada.close();
    }
}

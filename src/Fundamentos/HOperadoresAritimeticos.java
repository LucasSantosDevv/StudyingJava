package Fundamentos;

/* operadores podem ser classificados como unários, binários e ternários, basicamente se diferenciando pela quantidade
de operandos (valores) e operadores (símbolos e sinais), são eles que criam toda lógica associada aos programas
feitos com a linguagem */

/* Os operadores ARITIMÉTICOS são provavelmente os mais conhecidos até por quem não é programador, devido a serem
basicamente as 4 operações básicas da matemática (além do "resto" da multiplicação de números inteiros) */

//adição: + subtração: - multiplicação: * devisão: / módulo: %

public class HOperadoresAritimeticos {
    static void main(String[] args) {

        var a = 3.57;
        var b = 1.43;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        int c = 5;
        int d = 9;

        System.out.println(c + d);
        System.out.println(c + (double) d);
        System.out.println(c - d);
        System.out.println(c - (double) d);
        System.out.println(c * d);
        System.out.println(c * (double) d);
        System.out.println(c / d);
        System.out.println(c /(double) d);

    }
}

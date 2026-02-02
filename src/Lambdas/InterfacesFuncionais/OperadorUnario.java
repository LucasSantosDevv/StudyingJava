package Lambdas.InterfacesFuncionais;

/*
As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

Unary Operator: representa uma função que recebe um parâmetro de entrada e retorna um valor de mesmo tipo

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get

(Por ser uma variação de function usa o mesmo metodo, além de ser possível o uso do "andThen")
 */

import java.util.function.UnaryOperator;

public class OperadorUnario {
    static void main(String[] args) {

        //Estrutura base do 'UnaryOperator'
        UnaryOperator<Integer> dobro = n -> n * 2;
        UnaryOperator<Integer> triplo = n -> n * 3;
        UnaryOperator<Integer> metade = n -> n / 2;

        //Criação de uma variável para teste
        int teste = 10;

        //Criação de uma variável para o resultado e uso dos metodos 'function'
        int resultado = dobro.andThen(metade).andThen(triplo).apply(teste);
        //teste = 10 * 2 / 2 * 3
        IO.println(resultado);

        int resultado2 = dobro.compose(metade).andThen(triplo).apply(teste);
        //teste = 10 * 3 / 2 * 3
        IO.println(resultado2);
    }
}

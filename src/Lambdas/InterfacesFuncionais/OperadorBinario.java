package Lambdas.InterfacesFuncionais;

/*
As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

Binary Operator: representa uma função que recebe dois parâmetros de entrada e retorna um valor de mesmo tipo

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get

(Por ser uma variação de function usa o mesmo metodo, além de ser possível o uso do "andThen")
 */

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    static void main(String[] args) {

        //Estrutura base dos operadores binários
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        IO.println(media.apply(5.0, 10.0));

        //Mas também podemos usar uma variação que nos permite usar tipos distintos numa mesma função
        BiFunction<Double, Double, String> aprovados = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        IO.println("O aluno está: " + aprovados.apply(5.0, 8.0));
    }
}

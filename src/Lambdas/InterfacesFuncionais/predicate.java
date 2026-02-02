package Lambdas.InterfacesFuncionais;

/*As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

PREDICATE: representa uma função com valor booleano dentro de um argumento;

O que faz o predicate:
 - Verificar
 - Filtrar
 - Decidir
O que o predicate NÃO faz:
 - Não imprime
 - Não altera estado
 - Não executa lógica com efeito colateral

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get
 */

import java.util.function.Predicate;

public class predicate {
    static void main(String[] args) {

//Chamou a função / apresentou o argumento / condição para retornar o valor booleano
        Predicate<Produto> isExpensive = prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 1000;

        Produto p1 = new Produto("RTX 5070", 3500, 0.15);
        Produto p2 = new Produto("Galaxy Buds FE", 210, 0.09);

        IO.println("O produto " + p1.getNome() + " é caro? " + isExpensive.test(p1));
        IO.println("O produto " + p2.getNome() + " é caro? " + isExpensive.test(p2));

        //Também é possível usar o 'predicate' como composição, ou seja, fazer um encadeamento de funções...
        Predicate<Integer> par = n -> n % 2 == 0;
        Predicate<Integer> tresDig = n -> n >= 100 && n <= 999;

        IO.println(par.and(tresDig).test(366));
        //Aqui geramos dois predicados e os associamos com 'and', de forma que só retornará como 'true' se ambos casos forem verdade
        IO.println(par.or(tresDig).test(365));
        //Aqui testamos os mesmos dois predicados, mas com o uso do 'or' apenas um precisa ser verdade para que retorne 'true'

    }
}

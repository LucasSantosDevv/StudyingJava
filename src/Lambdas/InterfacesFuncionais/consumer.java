package Lambdas.InterfacesFuncionais;

/*As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

CONSUMER: representa uma função que recebe um valor e não retorna nada, semelhante a função 'void'

O que faz o Consumer:
 - Executar
 - Imprimir
 - Modificar
O que o Consumer NÃO faz:
 - Não decide
 - Não retorna valor
 - Não valida condição

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
    static void main(String[] args) {

        //Função lambda com o uso da interface funcional 'consumer'
        Consumer<Produto> imprimir = prod -> IO.println(prod.getNome() + " R$" + prod.getPreco());

        Produto p1 = new Produto("RTX 5070", 3500, 0.15);
        Produto p2 = new Produto("RTX 5070TI", 5500, 0.20);
        Produto p3 = new Produto("RTX 4060", 2400, 0.10);

        List<Produto> RTX50 = new ArrayList<Produto>();
        RTX50.add(p1);
        RTX50.add(p2);
        RTX50.forEach(imprimir);    //Uso do forEach para a function em uma collection

        imprimir.accept(p3);    //Uso da function fora de uma collection

        Consumer<Integer> dobrar = n -> IO.println(n * 2);
        dobrar.accept(3);
    }
}

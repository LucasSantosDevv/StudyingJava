package Lambdas.InterfacesFuncionais;

/*As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

SUPPLIER: representa uma função que não recebe um parâmetro de entrada e mesmo assim devolve um valor

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get

    A função do 'supplier' é gerar valores apenas sob demandas, principalmente quando ainda não existe valor algum, como por exemplo, chamar uma
mensagem ou número aleatório quando solicitado:
 */

import java.util.Random;
import java.util.function.Supplier;

public class supplier {
    static void main(String[] args) {

        //Estrutura base do 'Supplier'
        Supplier<Integer> ram = () -> new Random().nextInt(100);
        Supplier<String> saudacoes = () -> "Bem vindo";

        //Uso do metodo do 'Supplier'
        IO.println(ram.get());
        IO.println(saudacoes.get());

        //Exemplo usando classes
        Supplier<Produto> criarProduto = () -> new Produto("RTX 5090", 20499.99, 0.2);
        Produto p1 = criarProduto.get();
        IO.println(p1.getNome() + " R$" + p1.getPreco());
    }
}

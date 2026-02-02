package Collections;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

QUEUE (FILA): queue ou fila é um dos tipos das collections e tem como princípio o 'fifo' (first in, first of)

1. Pode ser heterogêneo, ou seja, pode ter diferentes tipos de dados armazenados, apesar de não ser o ideal;
2. Aceita objetos duplicados, ou seja, hashcode igual;
3. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.
 */

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();        //comando para criar uma queue

/*Tanto '.add' quanto '.offer' vão adicionar membros a fila, porém, seu comportamento muda quando a fila está cheia.
O primeiro lançara um erro no sistema, e o segundo irá retornar um valor booleano como false.
 */
        fila.add("Lucas");
        fila.offer("Christian");
        fila.add("Mathias");
        fila.offer("Lucas");

/*Tanto o '.peek' quanto o '.element' tem a função de pegar o próximo item da fila (sem remover), a diferença se da
para quando a fila ficar vazia. O primeiro retornará um valor nulo e o segundo gerará um erro.
*/
        System.out.println(fila.peek());
        System.out.println(fila.peek());

        System.out.println(fila.element());
        System.out.println(fila.element());

//Outros comandos importantes.

        System.out.println(fila.size());        //tamanho da fila

//"fila.clear();"       limpar a fila

        System.out.println("fila vazia? " + fila.isEmpty());     //verificar se a fila esta vazia

//Comando para pegar o próximo membro da fila, removendo-o

        System.out.println("\n" + fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());        //Nulo (fila vazia)
        System.out.println("fila vazia? " + fila.isEmpty());

//"fila.remove;" remove da fila sem pegar, e gera um erro em caso de fila vazia


    }
}

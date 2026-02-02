package Collections;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

STACK (PILHA): stack ou pilha é um dos tipos das collections e tem como princípio o 'lifo' (last in, first of)

1. Pode ser heterogêneo, ou seja, pode ter diferentes tipos de dados armazenados, apesar de não ser o ideal;
2. Aceita objetos duplicados, ou seja, hashcode igual;
3. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class stack {
    static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        //comandos para adicionar livros

        livros.add("O Pequeno Príncipe");   //em caso de pilha cheia retorna booleano
        livros.push("Don Quixote");   //em caso de pilha cheia retorna um erro

        //comandos para pegar os itens no topo da pilha (sem remover)

        System.out.println(livros.peek());      //em caso de pilha vazia retorna um valor nulo
        System.out.println(livros.element());       //em caso de pilha vazia retorna um erro

        //comando para remover itens da pilha

        System.out.println("\n" + livros.remove());     //em caso de pilha vazia retorna um erro
        System.out.println(livros.pop());      //em caso de pilha vazia retorna um erro
        System.out.println(livros.poll());      //em caso de pilha vazia retorna um nulo

        //outros comandos

        //livros.size();        (para saber o tamanho da pilha)
        //livros.clear();       (para limpar a fila)
        //livros.contains();        (para saber se certo elemento existe na pilha)

    }
}

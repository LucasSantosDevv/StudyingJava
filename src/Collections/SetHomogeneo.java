package Collections;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

SET: o set é um dos tipos de collections, e tem como características principais:

1. Pode ser heterogêneo, ou seja, pode ter diferentes tipos de dados armazenados, apesar de não ser o ideal;
2. Não aceita objetos duplicados, ou seja, hashcode igual;
3. Pode ser (mas não obrigatoriamente) ordenado;
4. Não indexado;
5. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.              */

import java.util.HashSet;
import java.util.TreeSet;

public class SetHomogeneo {
    static void main(String[] args) {

      //Hashset<String> listaAprovados = new Hashset<>();      (criação de um set que aceita apenas 'Strings')
        TreeSet<String> listaAprovados = new TreeSet<>();      //criação de um set com critério de ordenação

        listaAprovados.add("Lucas");
        listaAprovados.add("Luana");
        listaAprovados.add("Lucio");
        listaAprovados.add("Lurdes");

        System.out.println("----- Segue a baixo a lista de aprovados -----");

        for(String aprovados : listaAprovados){
            System.out.println(aprovados);
        }

        TreeSet<Integer> numeros = new TreeSet<>();      //criação de um set com critério de ordenação

        numeros.add(2);
        numeros.add(4);
        numeros.add(1);
        numeros.add(3);

        System.out.println("\n----- Números -----");

        for(int a : numeros){
            System.out.println(a);
        }
    }
}

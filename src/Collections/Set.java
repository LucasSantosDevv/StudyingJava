package Collections;

import java.util.HashSet;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

SET: o set é um dos tipos de collections, e tem como características principais:

1. Pode ser heterogêneo, ou seja, pode ter diferentes tipos de dados armazenados, apesar de não ser o ideal;
2. Não aceita objetos duplicados, ou seja, hashcode igual;
3. Pode ser (mas não obrigatoriamente) ordenado;
4. Não indexado;
5. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.
                                                                                                                    */
public class Set {

    String objeto;

    static void main(String[] args) {

        Set o1 = new Set();
        o1.objeto = "Teclado";

        HashSet teste = new HashSet();      //comando para criar uma coleção

        teste.add(1.2);
        teste.add(true);
        teste.add(65);
        teste.add("Lucas");
        teste.add(o1);      //comando para adicionar elementos

        System.out.println("A quantidade de elementos do conjunto 1 é: " + teste.size());     //comando para 'tamanho'
        System.out.println("Os elementos do conjunto 1 são: " + teste + "\n");

        teste.remove("Lucas");      //comando para remover elementos

        System.out.println("A quantidade de elementos do conjunto 1 é: " + teste.size());
        System.out.println("Os elementos do conjunto 1 são: " + teste + "\n");

        System.out.println(teste.contains(65));     //comando para verificar se algo esta ou não presente

        HashSet teste2 = new HashSet();

        teste2.add(1.2);
        teste2.add(65);
        teste2.add(150.1);

        System.out.println("\nA quantidade de elementos do conjunto 2 é: " + teste2.size());

        teste.addAll(teste2);       /*comando para adicionar conjunto dentro de conjunto
                                    só vai adicionar o '150.1' porque os demais são repetidos           */
        System.out.println("\nA quantidade de elementos do conjunto 1 é: " + teste.size());
        System.out.println("Os elementos do conjunto 1 são: " + teste);

        teste.retainAll(teste2);        /*comando para fazer uma interseção entre os conjutos, mantendo apenas aquilo
                                        que ambos te em comum                                           */
        System.out.println("\nA quantidade de elementos do conjunto 1 é: " + teste.size());
        System.out.println("Os elementos do conjunto 1 são: " + teste);
        System.out.println("\nA quantidade de elementos do conjunto 2 é: " + teste2.size());

    }
}

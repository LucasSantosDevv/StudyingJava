package Collections;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

LIST: o list é um dos tipos de collections, e tem como características principais:

1. Pode ser heterogêneo, ou seja, pode ter diferentes tipos de dados armazenados, apesar de não ser o ideal;
2. Aceita objetos duplicados, ou seja, hashcode igual;
3. Obrigatoriamente ordenado;
4. É indexado;
5. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.
 */

import java.util.ArrayList;

public class List {
    static void main(String[] args) {

        ArrayList<ListObjetos> Colaboradores = new ArrayList<>();       /*comando para criar Listas (nesse caso do tipo
                                                                        array*/

        Colaboradores.add(new ListObjetos("Lucas"));
        Colaboradores.add(new ListObjetos("Alcemar"));
        Colaboradores.add(new ListObjetos("Bruno"));
        Colaboradores.add(new ListObjetos("Bruno"));
        Colaboradores.add(new ListObjetos("Carlos"));
        Colaboradores.add(new ListObjetos("Darius"));
        Colaboradores.add(new ListObjetos("Erik"));     /*fusão dos comandos de adicionar a lista com criar um novo
                                                             objeto*/

        for(ListObjetos nomes : Colaboradores) {        //forma padrão de acessar a coleção
            System.out.println(nomes);
        }

        System.out.println("\n"+ Colaboradores.get(2));     //forma de acessar a coleção pelo índice (nem todas permitem)

        Colaboradores.remove(Colaboradores.get(4));     //removendo da coleção diretamente pelo índice
        System.out.println(Colaboradores.get(4));

        //Provando que a lista aceita objetos repetidos
        System.out.println(new ListObjetos("Bruno").equals(new ListObjetos("Bruno")));
    }
}

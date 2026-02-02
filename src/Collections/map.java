package Collections;

/* Existem vários tipos de coleções, e de forma geral, elas basicamente servem para armazenar dados, e objetos, como os
'arrays', porém as collections funcionam melhor quando se trata de uma quantidade massiva de informação, uma vez que
diferentemente do último, este pode ter sua capacidade declarada ou não, podendo ser expandida.

MAP: o map é um dos tipos de collections, e tem como características principais:

1. Funciona no sistema 'chave/valor', ou seja, ele atribui um elemento a outro;
2. O valor aceita objetos duplicados, ou seja, hashcode igual;
3. A chave não aceita objetos duplicados, ou seja, hashcode igual;
4. Não aceita tipos primitivos, caso queira usar, será feita uma conversão automática para os Wrappers.
 */

import java.util.HashMap;
import java.util.Map;

public class map {
    static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Alberto");
        usuarios.put(2, "Bruno");
        usuarios.put(3, "Carlos");
        usuarios.put(4, "Dante");
        usuarios.put(5, "Eduardo");
        usuarios.put(6, "Fernando");
        usuarios.put(7, "Guilherme");   //comando serve tanto para adicionar quanto para substituir um valor

        usuarios.put(7,"Lucas");    //substituindo o valor da chave '7'

        System.out.println(usuarios.entrySet());    //imprimindo todas as chaves e valores

        System.out.println(usuarios.keySet());    //imprimindo todas as chaves
        System.out.println(usuarios.values());    //imprimindo todas os valores

        System.out.println(usuarios.get(4));    //acessando pelo índice através da chave

        System.out.println(usuarios.containsKey(2));    //verificando a existência através da chave
        System.out.println(usuarios.containsValue("Lucas") + "\n");    //verificando a existência através da chave

        //formas de percorrer um map:

        for(int chave : usuarios.keySet()){     //somente pelas chaves
            System.out.println(chave);
        }
        for(String valor : usuarios.values()){      //somente pelos valores
            System.out.println(valor);
        }
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){     //pelas chaves e valores
            System.out.println(registro);
        }
    }
}

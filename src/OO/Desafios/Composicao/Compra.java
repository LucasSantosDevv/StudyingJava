package OO.Desafios.Composicao;

import java.util.ArrayList;

/*  Classe multifunção, criar uma lista de itens que serão comprados, cria um metodo para adicionar os itens a lista
e outro para calcular o valor da compra */

public class Compra {

    ArrayList<item> listaCompras = new ArrayList<>();       //Lista de itens que serão comprados

    //Metodo para adicionar os itens a lista de compras que será usado para inserir o produto e sua quantidade
    void adicionarItem(Produto p, int quantidade){  //metodo relaciona um produto 'p' com uma quantidade
        listaCompras.add(new item(p, quantidade));  //chama o construtor de itens para criar um objeto com o produto...
    }                                               //... 'p' e adiciona a lista de compra

    double valorTotal(){        //Metodo para calcular o valor da compra
        double total = 0;

        for(item item : listaCompras){
            total += item.quantidade * item.nomeProduto.preco;
        }
        return total;
    }

}

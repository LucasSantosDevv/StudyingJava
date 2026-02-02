package OO.Desafios.Composicao;

import java.util.ArrayList;

/*  Classe meio merda para criação de parâmetros do comprador, criação de uma lista que associa as compras ao comprador
e um metodo que faz a soma total de totas as compras do usuário
*/

public class Cliente {

    String nome;
    Cliente(String nome){
        this.nome = nome;
    }

    ArrayList<Compra> compras = new ArrayList<>();      //Lista para guardar o número de compras do usuário

    double valorCompras(){      //Metodo para somar o valor total das compras
        double total = 0;

        for(Compra compra : compras){
            total += compra.valorTotal();
        }
        return total;
    }
}

package OO.Desafios.Composicao;

//  Classe para criar os produtos que estão à venda no sistema.

public class Produto {

    String nome;        //Nome do objeto
    double preco;       //Preço do objeto

    Produto(String nome, double preco){     //Construtor dos produtos a venda (criado na classe Sistema)
        this.nome = nome;
        this.preco = preco;
    }
}

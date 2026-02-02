package OO.Desafios.Composicao;

//  Classe para criar os objetos que serão comprados pelo usuário

public class item {

    Produto nomeProduto;        //Tipo do produto comprado (import da classe Produto)
    int quantidade;     //Quantidade do produto comprado

    item(Produto nomeProduto, int quantidade){      //Construtor dos produtos que serão comprados (usado no Sistema)
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }
}

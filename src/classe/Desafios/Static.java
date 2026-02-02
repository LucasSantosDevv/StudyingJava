package classe.Desafios;

public class Static {

    String nome;
    double preco;
    static double desconto = 0.25;

    Static(String nomeProduto, double precoProduto){
        nome = nomeProduto;
        preco = precoProduto;
    }

    double precoCompra(){
        return preco * (1 - desconto);
    }

}

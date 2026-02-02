package classe;

/*  Aqui podemos ver as 3 variáveis (ou tipos Java) que criamos na classe anterior, como tudo esta dentro do
mesmo pacote não há a necessidade de importar, além de, através do comando "Produto 'nome' = new Produto();"
criarmos o nosso objeto. Nota-se também o comando "new", que leva a função de construtor do novo objeto  */

public class ObjetoTeste {
    public static void main(String[] args) {

        Objeto p1 = new Objeto("Notebook"); //Objeto p1
        p1.preco = 5999.90; //Uso da notação ponto para alteração do tipo java para o objeto
        p1.desconto = 0.2;

        Objeto p2 = new Objeto("Smartphone"); //Objeto p2
        p2.preco = 2399.99; //Uso da notação ponto para alteração do tipo java para o objeto
        p2.desconto = 0.1;

        Objeto p3 = new Objeto("Fone de ouvido"); //Objeto p3
        p3.preco = 201.5; //Uso da notação ponto para alteração do tipo java para o objeto
        p3.desconto = 0.05;

        double preco1desconto = p1.preco * (1 - p1.desconto);
        double preco2desconto = p2.preco * (1 - p2.desconto);
        double preco3desconto = p3.preco * (1 - p3.desconto);

        System.out.printf("%s R$%.2f",p1.nome, preco1desconto);
        System.out.printf("\n\n%s R$%.2f",p2.nome, preco2desconto);
        System.out.printf("\n\n%s R$%.2f",p3.nome, preco3desconto);
    }
}




package OO.Desafios.Composicao;

/*  Classe principal onde os objetos/produtos, compradores e as compras são criadas, além de adicionadas as listas de
itens e de compra.
 */

public class Sistema {
    static void main(String[] args) {

        Produto livro2 = new Produto("Livro1", 29.90);
        Produto livro1 = new Produto("Livro1", 19.90);
        Produto livro3 = new Produto("Livro1", 39.90);      //Criou os produtos

        Cliente cliente1 = new Cliente("Lucas");     //Criou o cliente
        Compra compra1 = new Compra();                     //Criou uma compra

        compra1.adicionarItem(livro1, 3);
        compra1.adicionarItem(livro2, 2);       //Uso do metodo de adicionar item

        cliente1.compras.add(compra1);        //Adição da 'compra1' a lista de compras do usuário

        Compra compra2 = new Compra();      //Criou outra compra

        compra2.adicionarItem(livro3, 1);
        compra2.adicionarItem(livro2, 1);

        cliente1.compras.add(compra2);        //Adição da 'compra2' a lista de compras do usuário

        System.out.println("\nO valor da compra foi de: R$" + compra1.valorTotal());
        System.out.println("\nO valor da compra foi de: R$" + compra2.valorTotal());
        System.out.println("\nO total gasto pelo usuário " + cliente1.nome + " foi de: R$" + cliente1.valorCompras());
    }
}


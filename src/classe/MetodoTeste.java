package classe;

public class MetodoTeste {
    static void main(String[] args) {

        Metodo p1 = new Metodo(); //Objeto p1
        p1.NOME = "Notebook";
        p1.PRECO = 5999.90; //Uso da notação ponto para alteração do tipo java para o objeto
        p1.DESCONTO = 0.2;

        Metodo p2 = new Metodo(); //Objeto p2
        p2.NOME = "Smartphone";
        p2.PRECO = 2399.99; //Uso da notação ponto para alteração do tipo java para o objeto
        p2.DESCONTO = 0.1;

        Metodo p3 = new Metodo(); //Objeto p3
        p3.NOME = "Fone de ouvido";
        p3.PRECO = 201.5; //Uso da notação ponto para alteração do tipo java para o objeto
        p3.DESCONTO = 0.05;

        double precofinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto();
        double precofinal3 = p3.precoComDesconto();

        System.out.printf("%s: R$%.2f",p1.NOME, precofinal1);
        System.out.printf("\n\n%s: R$%.2f", p2.NOME, precofinal2);
        System.out.printf("\n\n%s: R$%.2f", p3.NOME, precofinal3);

/*Perceba que a diferença aqui, é que deixamos como função da primeira classe fazer o cálculo de desconto
dos objetos, e nesta classe apenas criamos variáveis para armazenar seus resultados e imprimimos seus valores*/
    }
}

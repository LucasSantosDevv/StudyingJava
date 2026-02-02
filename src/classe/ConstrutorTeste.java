package classe;

public class ConstrutorTeste {
    static void main(String[] args) {

        Construtor p1 = new Construtor("Notebook",5999.90, 0.2);
        Construtor p2 = new Construtor("Smartphone", 2399.90, 0.1);
        Construtor p3 = new Construtor("Fone de ouvido", 201.5, 0.05);

    /* Nota-se que aqui foi possível criar o objeto diretamente com todos os seus atributos, sem necessidade de fazer
    manualmente   */

        double precoFinal = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal3 = p3.precoComDesconto();

    //Nota-se aqui o uso do metodo criado na classe para calcular o produto com o seu desconto

        System.out.printf("%s R$%.2f ", p1.nome, p1.precoComDesconto());
        System.out.printf("\n%s R$%.2f ", p2.nome, p2.precoComDesconto());
        System.out.printf("\n%s R$%.2f ", p3.nome, p3.precoComDesconto());
    }
}

/*O construtor funciona quase como um correio reverso, dentro da classe inicial você criar o construtor modificado,
(sem retorno) + nome da classe + as variáveis necessárias (nesse caso os atributos dos produtos) + a equivalência
dos atributos originais com os criados dentro do construtor. E para quê? Para quando o / os produtos realmente forem
criados, seus atributos substituirão os valores dos atributos originais na primeira classe e o metodo será executado.

public class Construtor {

        String nome;
        double preco;
        double desconto;

        double precoComDesconto(){
            return preco * (1-desconto);
        }

        Construtor(String nomeProduto, double precoProduto, double descontoProduto){
            nome = nomeProduto;
            preco = precoProduto;
            desconto = descontoProduto;
        }
}

 */
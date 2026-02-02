package classe;

/* Aqui chegamos na versão mais otimizada da criação de objetos e classes, então vamos recapitular um pouco:
________________________________________________________________________________________________________________________
CLASSE: a classe é um molde para a criação dos objetos, é dentro dela que ficam as variáveis possibilitando sua criação,
        seu tipo e o que ele pode fazer (atributos), além de portarem também os métodos, que são, na verdade, as ações
        do objeto a ser criado e o construtor(es).
________________________________________________________________________________________________________________________
MÉTODOS: são as ações que serão realizadas com o objeto através dos atributos e seus dados, formando a estrutura de
         dados. E como os métodos funcionam: tipo de retorno + nome do metodo + parâmetros de entrada + algoritmo.
________________________________________________________________________________________________________________________
CONSTRUTORES: essa é a nova área do conhecimento, por padrão o Java já tem o seu próprio construtor que fica "invisível"
              no código como vimos nas atividades anteriores, já que nunca foi necessário escrevê-lo, porém era necessário
              alterar o nome de cada objeto manualmente depois. Por isso é possível criar construtores manuais para tais
              tarefas, otimizando códigos que possuam muitos objetos, como veremos a baixo. A estrutura base se baseia
              em: (não tem retorno) + nome da classe + parâmetros de entrada. (Sem parâmetro = construtor padrão)
________________________________________________________________________________________________________________________
OBJETO: também chamado de instância ou no verbo instanciar, é o resultado de tudo que fizemos na classe, junção dos
        atributos, métodos e construtores. Nome da classe + nome do objeto = new construtor (vai ser igual à classe)
________________________________________________________________________________________________________________________
                                                                                                                      */
public class Construtor {

        String nome;
        double preco;
        double desconto;                    //atributos da classe (dados)

        double precoComDesconto(){
            return preco * (1-desconto);    //métodos do(s) objetos (estrutura de dados)
        }

        Construtor(String nomeProduto, double precoProduto, double descontoProduto){
            nome = nomeProduto;
            preco = precoProduto;
            desconto = descontoProduto;            //construtor do objeto

        /*Construtor(){
            {               (modelo do construtor padrão Java
                                                                                                                   */
        }
}

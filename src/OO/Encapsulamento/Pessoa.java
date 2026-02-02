package OO.Encapsulamento;

/*  O encapsulamento "protege" variáveis dentro do código, permitindo ou não que sejam acessadas / alteradas em outras
partes do programa. E elas são:

1. Private: maior nível de segurança, só permite alteração dentro da própria classe;
2. Default: quando não é indicado nenhum palavra reservada da linguagem, só permite alteração dentro do próprio pacote;
3. Protect: permite acesso a subclasses em pacotes diferentes (herança);
4. Public: dado aberto para ser acessado e alterado de qualquer lugar.

 */

public class Pessoa {

    private int idade;     //dado privado, não pode ser acessado fora desta classe
    private String nome;

    public Pessoa(int idade, String nome){   //construtor para alterar a idade ao criar um objeto
        setIdade(idade);
        setNome(nome);
    }

    //Getter's (função de 'pegar' algo)
    public int getIdade(){      //metodo criado para que seja possível acessar o dado fora desta classe
        return idade;
    }
    public String getNome() {
        return nome;
    }

    //Setter's (função de alterar algo)
    public void setIdade(int alterarIdade){    //metodo para alterar a idade
       if(alterarIdade >= 0 && alterarIdade <= 120) {
           idade = alterarIdade;
       }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

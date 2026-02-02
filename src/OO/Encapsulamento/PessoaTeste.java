package OO.Encapsulamento;

public class PessoaTeste {
    static void main(String[] args) {

        Pessoa p1 = new Pessoa(0, "Rn de Cláudia"); //Uso do construtor
        p1.setNome("Lucas");
        p1.setIdade(24);    //Uso dos Setter's

        IO.println(p1.getNome() + ", " + p1.getIdade() + " anos");  //Uso dos Getter's
    }
}

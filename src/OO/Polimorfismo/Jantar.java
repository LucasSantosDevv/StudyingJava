package OO.Polimorfismo;

public class Jantar {
    static void main(String[] args) {

        Comidas ingrediente1 = new Arroz(0.5);
        Comidas ingrediente2 = new Feijao(0.25);
        Comidas ingrediente3 = new Sorvete(0.25);

        Pessoa convidado = new Pessoa(70.5, "Lucas");

        IO.println("O peso do " + convidado.getNome() + " é " + convidado.getPeso() + "Kg");

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        IO.println("O peso do " + convidado.getNome() + " é " + convidado.getPeso() + "Kg");
    }
}


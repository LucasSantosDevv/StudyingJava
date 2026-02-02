package classe.Desafios.DesafioModulo;

public class Jantar {

    static void main(String[] args) {

        Pessoa p1 = new Pessoa("Lucas", 70);

        Comida c1 = new Comida("Strgonoff", 0.750);
        Comida c2 = new Comida("Xis tudo", 1.250);
        Comida c3 = new Comida("Acaí", 0.500);

    System.out.println(p1.peso);

        p1.comer(c1);
    System.out.println(p1.peso);

        p1.comer(c2);
    System.out.println(p1.peso);

        p1.comer(c3);
    System.out.println(p1.peso);

    }
}

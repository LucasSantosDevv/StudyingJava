package OO.Desafios.GPT;

public class Jogo {
    static void main(String[] args) {

        Guerreiro g1 = new Guerreiro("Guerreiro", 2, 2, 200, true);
        Guerreiro g2 = new Guerreiro("Guerreiro", 3, 2, 200, true);

        Arqueiro a1 = new Arqueiro("Arqueiro", 9, 9, 150, true);
        Arqueiro a2 = new Arqueiro("Arqueiro", 9, 6, 150, true);

        g1.atacar(g2);
        g1.atacar(g2);
        g1.atacar(g2);
        g1.atacar(g2);

        IO.println(g2.getVida());
        IO.println(g2.isVivo());
        IO.println();

        a1.atacar(a2);
        a1.atacar(a2);
        a1.atacar(a2);
        a1.atacar(a2);

        IO.println(a2.getVida());
        IO.println(a2.isVivo());
        IO.println();

    }
}

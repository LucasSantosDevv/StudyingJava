package OO.Heranca;

public class Xadrez {
    static void main(String[] args) {

        Jogadores j1 = new Rainha("Rainha preta",1, 1, 100, true);
        Jogadores j2 = new Torre("Torre branca", 8, 8, 100, true);
        Jogadores j3 = new Bispo("Bispo branco", 2, 3, 100, true);

        System.out.printf("A posição x da " + j1.nome + " é: " + j1.x + " e y: " + j1.y + "\nVivo: " + j1.vivo);
        System.out.println();
        System.out.printf("A posição x da " + j2.nome + " é: " + j2.x + " e y: " + j2.y + "\nVivo: " + j2.vivo);
        System.out.println();

        j1.movimentacao("norte");
        j1.movimentacao("norte");
        j1.movimentacao("norte");
        j1.movimentacao("leste");
        j1.movimentacao("leste");
        j1.movimentacao("leste");

        j2.movimentacao("sul");
        j2.movimentacao("sul");
        j2.movimentacao("sul");
        j2.movimentacao("oeste");
        j2.movimentacao("oeste");
        j2.movimentacao("oeste");
        j2.movimentacao("oeste");

        System.out.printf("\nA posição x da " + j1.nome + " é: " + j1.x + " e y: " + j1.y + "\nVivo: " + j1.vivo);
        System.out.println();
        System.out.printf("A posição x da " + j2.nome + " é: " + j2.x + " e y: " + j2.y + "\nVivo: " + j2.vivo);
        System.out.println();

        j1.atacar(j2);

        System.out.printf("\nA posição x da " + j1.nome + " é: " + j1.x + " e y: " + j1.y + "\nVivo: " + j1.vivo);
        System.out.println();

        j3.atacar(j1);
        System.out.printf("\nA posição x da " + j3.nome + " é: " + j3.x + " e y: " + j3.y + "\nVivo: " + j3.vivo);


    }
}

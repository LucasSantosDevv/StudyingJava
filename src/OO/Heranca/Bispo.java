package OO.Heranca;

public class Bispo extends Jogadores{

    Bispo(String nome, int x, int y, int vida, boolean vivo) {
        super(nome, x, y, vida, vivo);
    }

    boolean movimentacao(String andar){
        if ("nordeste".equalsIgnoreCase(andar) && x < 8 && y < 8){
            y++;
            x++;
        }
        if ("noroeste".equalsIgnoreCase(andar) && x > 8 && y < 1){
            y++;
            x--;
        }
        if ("sudeste".equalsIgnoreCase(andar) && x < 8 && y > 1){
            y--;
            x++;
        }
        if ("sudoeste".equalsIgnoreCase(andar) && x > 1 && y > 1){
            y--;
            x--;
        }
        return true;
    }

    boolean atacar(Jogadores oponente){
        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltax == deltay){
            oponente.vida -= 100;
            if (oponente.vida <= 0) {
                oponente.vivo = false;
                int alvoX = oponente.x;
                int alvoY = oponente.y;
                oponente.x = -1;
                oponente.y = -1;
                this.x = alvoX;
                this.y = alvoY;
            }
            System.out.println("\nAtaque a(ao) " + oponente.nome + " válido");
            return true;
        }else {
            System.out.println("\nAtaque a(ao) " + oponente.nome + " inválido");
            return false;
        }
    }
}

package OO.Heranca;

public class Jogadores {
    String nome;
    int vida;
    int x;
    int y;
    boolean vivo;

    Jogadores(String nome, int x, int y, int vida, boolean vivo){
       this.nome = nome;
        this.x = x;
        this.y = y;
        this.vivo = vivo;
        this.vida = vida;
    }
    boolean movimentacao(String andar){
         if ("norte".equalsIgnoreCase(andar) && y < 8){
            y++;
         }
        if ("sul".equalsIgnoreCase(andar) && y > 1){
            y--;
        }
        if ("leste".equalsIgnoreCase(andar) && x < 8){
            x++;
        }
        if ("oeste".equalsIgnoreCase(andar) && x > 1){
            x--;
        }
    return true;
    }

    boolean atacar(Jogadores oponente){

        if (!this.vivo) {
            System.out.println("\nVocê está morto e não pode atacar.");
            return false;
        }
        if (!oponente.vivo) {
            System.out.println("\nO oponente já está morto.");
            return false;
        }

        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltax == 0 && deltay == 1){
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
        } else if (deltax == 1 && deltay ==0) {
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


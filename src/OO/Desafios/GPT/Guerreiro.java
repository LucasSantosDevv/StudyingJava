package OO.Desafios.GPT;

public class Guerreiro extends Personagens{

    Guerreiro(String nome, int posX, int posY, int vida, boolean vivo){
        super(nome, posX, posY, vida, vivo);
    }

    boolean movimentacao(String andar){
        if("leste".equalsIgnoreCase(andar) && getPosX() < 10){
            setPosX(+ 3);
        }
        if("oeste".equalsIgnoreCase(andar) && getPosX() > 1){
            setPosX(- 3);
        }
        if("norte".equalsIgnoreCase(andar) && getPosY() < 10){
            setPosY(+ 3);
        }
        if("sul".equalsIgnoreCase(andar) && getPosY() > 1){
            setPosY(- 3);
        }
        return true;
    }

    boolean atacar(Personagens oponente){
        if(!this.isVivo()){
            IO.println("Você esta morto");
        }
        if(!oponente.isVivo()){
            IO.println("O oponente já esta morto");
        }
        int deltaX = Math.abs(getPosX() - oponente.getPosX());
        int deltaY = Math.abs(getPosY() - oponente.getPosY());

        if(deltaX == 1 && deltaY == 0){
            oponente.setVida(oponente.getVida() - 50);
            IO.println(oponente.getNome() + " -50");
            if(oponente.getVida() <= 0){
                IO.println("O " + oponente.getNome() + " foi destruído");
                oponente.setVivo(false);
            }
            return true;

        } else if (deltaX == 0 && deltaY == 1) {
            oponente.setVida(getVida() - 50);
            IO.println(oponente.getNome() + " -50");
            if(oponente.getVida() <= 0){
                IO.println("O " + oponente.getNome() + " foi destruído");
                oponente.setVivo(false);
            }
            return true;

        }else{
            IO.println("Impossível atacar desta posição");
            return false;
        }
    }
}

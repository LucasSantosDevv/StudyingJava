package OO.Desafios.GPT;

public class Arqueiro extends  Personagens{

    Arqueiro(String nome, int posX, int posY, int vida, boolean vivo){
        super(nome, posX, posY, vida, vivo);
    }

    boolean movimentacao(String andar){
        if("leste".equalsIgnoreCase(andar) && getPosX() < 10){
            setPosX(+ 2);
        }
        if("oeste".equalsIgnoreCase(andar) && getPosX() > 1){
            setPosX(- 2);
        }
        if("norte".equalsIgnoreCase(andar) && getPosY() < 10){
            setPosY(+ 2);
        }
        if("sul".equalsIgnoreCase(andar) && getPosY() > 1){
            setPosY(- 2);
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

        if(deltaX == 0 && deltaY <= 3){
            oponente.setVida(oponente.getVida() - 38);
            IO.println(oponente.getNome() + " -38");
            if(oponente.getVida() <= 0){
                IO.println("O " + oponente.getNome() + " foi destruído");
                oponente.setVivo(false);
            }
            return true;

        } else if (deltaX <= 3 && deltaY == 0) {
            oponente.setVida(getVida() - 38);
            IO.println(oponente.getNome() + " -38");
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

package OO.Desafios.Heranca;

public class Civic extends Carro implements ModoEsporte {

    Civic(String nome, int velocidadeAtual, boolean ligado, int velocidadeMaxima){
            super(nome, velocidadeAtual, ligado, velocidadeMaxima);
    }
    void acelerar (){
        if(ligado == true){
            potencia += 2;
            velocidadeAtual = velocidadeInicial * potencia;
            if(velocidadeAtual > velocidadeMaxima){
                velocidadeAtual = velocidadeMaxima;
            }
        }else{
            IO.println("O carro precisa estar ligado");
        }
    }

    @Override
    public void ligarSport() {
        potencia += 2;
    }

    @Override
    public void desligarSport() {
        potencia -= 2;
    }
}

package OO.Desafios.Heranca;

public class Carro {
    String nome;
    int velocidadeAtual;
    boolean ligado = false;
    int velocidadeMaxima;
    int velocidadeInicial;
    int potencia = 0;

    Carro(String nome, int velocidadeAtual, boolean ligado, int velocidadeMaxima){
        this.nome = nome;
        this.velocidadeAtual =velocidadeAtual;
        this.ligado = ligado;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    void ligar (){
        ligado = true;
        velocidadeInicial = 10;
        potencia = 1;
        IO.println("\n" + this.nome + " esta ligado\n");
    }

    void desligar (){
        ligado = false;
        velocidadeAtual = 0;
        potencia = 0;
        IO.println("\n" + this.nome + " esta desligado\n");
    }

    void acelerar (){
        if(ligado == true){
           potencia += 1;
           velocidadeAtual = velocidadeInicial * potencia;
           if(velocidadeAtual > velocidadeMaxima){
               velocidadeAtual = velocidadeMaxima;
           }
        }else{
            IO.println("O carro precisa estar ligado");
        }
    }

    void frear(){
        if (ligado == true){
            potencia -= 1;
            velocidadeAtual = velocidadeInicial * potencia;
            if(potencia == 1){
                velocidadeAtual = 0;
            }
        }else{
            IO.println("O carro precisa estar ligado");
        }
    }

}

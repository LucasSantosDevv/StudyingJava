package OO.Composição;

/*  Dentro da orientação a objetos tudo funciona a partir de classes e como elas interagem entre si, nem todas precisam
se ligar com todas (melhor que nem seja mesmo), mas todas devem estar ligadas com algo, de forma que se há uma classe
que não se liga a nada, é uma classe inútil que so ocupa espaço sem necessidade. Além disso existem diferentes relações
entre as classes, podendo ser 'uni' ou 'bi' direcional (geralmente e preferencialmente unidirecional), e essas classes
podem dar origem a objetos com diferente tipos de relacionamentos entre si, como por exemplo: 1 para 1 (um para um),
1 para 'n' (um para muitos ou vice versa) e 'n' para n (muitos para muitos). E isso significa que podem existir objetos
que interajam unicamente com outro objeto, objetos que interajam com muitos objetos ou muitos objetos que interajam com
muitos objetos.

Objeto carro: essa classe permite gerar um objeto que ira interagir com o objetos de múltiplas classes, e como cada
carro tem diversas partes e peças, temos um relacionamento de um para 'n'.
*/

public class Carro {

    Motor motor = new Motor(false, 1);      //Objeto motor
    Portas portas = new Portas(3);      //Objeto portas

    //Métodos do motor
    void acelerar(){
        if(motor.fatorInjecao < 16 && !portas.abertas) {
            motor.fatorInjecao += 0.5;
        }else{
            System.out.println("Impossível acelerar");
        }
    }

    void  frear(){
        if(motor.fatorInjecao > 1) {
            motor.fatorInjecao -= 0.5;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }

    //Métodos das portas
    void abrirPortas(){
        portas.abertas = true;
    }

    void fecharPortas(){
        portas.abertas = false;
    }

    boolean estaoAbertas(){
        return portas.abertas;
    }
}

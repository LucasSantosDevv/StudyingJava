package OO.Composição;

/*  Dentro da orientação a objetos tudo funciona a partir de classes e como elas interagem entre si, nem todas precisam
se ligar com todas (melhor que nem seja mesmo), mas todas devem estar ligadas com algo, de forma que se há uma classe
que não se liga a nada, é uma classe inútil que so ocupa espaço sem necessidade. Além disso existem diferentes relações
entre as classes, podendo ser 'uni' ou 'bi' direcional (geralmente e preferencialmente unidirecional), e essas classes
podem dar origem a objetos com diferente tipos de relacionamentos entre si, como por exemplo: 1 para 1 (um para um),
1 para 'n' (um para muitos ou vice versa) e 'n' para n (muitos para muitos). E isso significa que podem existir objetos
que interajam unicamente com outro objeto, objetos que interajam com muitos objetos ou muitos objetos que interajam com
muitos objetos.

Objeto motor: essa classe permite gerar um objeto que ira interagir com o objeto carro de outra classe, e como cada
carro geralmente tem somente um motor, temos um relacionamento um para um.
 */

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;    //Variáveis

    Motor(boolean ligado, double fatorInjecao){     //Construtor do motor
        this.ligado = ligado;
        this.fatorInjecao = fatorInjecao;
    }

    double rpm(){       //metodo do cálculo de aceleração
        if(!ligado){
            return 0;
        }else{
            return Math.round(fatorInjecao * 500);
        }
    }
}

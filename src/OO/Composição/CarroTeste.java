package OO.Composição;

/*  Dentro da orientação a objetos tudo funciona a partir de classes e como elas interagem entre si, nem todas precisam
se ligar com todas (melhor que nem seja mesmo), mas todas devem estar ligadas com algo, de forma que se há uma classe
que não se liga a nada, é uma classe inútil que so ocupa espaço sem necessidade. Além disso existem diferentes relações
entre as classes, podendo ser 'uni' ou 'bi' direcional (geralmente e preferencialmente unidirecional), e essas classes
podem dar origem a objetos com diferente tipos de relacionamentos entre si, como por exemplo: 1 para 1 (um para um),
1 para 'n' (um para muitos ou vice versa) e 'n' para n (muitos para muitos). E isso significa que podem existir objetos
que interajam unicamente com outro objeto, objetos que interajam com muitos objetos ou muitos objetos que interajam com
muitos objetos.
*/

public class CarroTeste {
    static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println("Motor está ligado: " + c1.estaLigado());

        c1.ligar();
        System.out.println("\nMotor está ligado: " + c1.estaLigado());

        System.out.println("\nO motor esta a: " + c1.motor.rpm() + " Rpm's");
        System.out.println("A injeção do motor esta a: " + c1.motor.fatorInjecao);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("\nO motor esta a: " + c1.motor.rpm() + " Rpm's");
        System.out.println("A injeção do motor esta a: " + c1.motor.fatorInjecao);

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("\nO motor esta a: " + c1.motor.rpm() + " Rpm's");
        System.out.println("A injeção do motor esta a: " + c1.motor.fatorInjecao);

        c1.desligar();

        c1.abrirPortas();
        System.out.println("\nPortas abertas: " + c1.estaoAbertas() + "\n");

        c1.ligar();
        c1.acelerar();

        c1.fecharPortas();
        System.out.println("O motor esta a: " + c1.motor.rpm() + " Rpm's");
        System.out.println("A injeção do motor esta a: " + c1.motor.fatorInjecao);

        System.out.println("\nOs vidros estão abertos: " + c1.portas.vidros);
        c1.portas.vidrosAbrir();
        System.out.println("Os vidros estão abertos: " + c1.portas.vidros);
    }
}

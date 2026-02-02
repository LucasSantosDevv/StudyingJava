package Fundamentos.Desafios;

//Resolver uma equação aritimética através dos operadores

public class ZDesafioOperadoresAritimeticos {
    static void main(String[] args) {

        int a = 1 - 5;
        int b = 2 - 7;
        int c = a * b / 2;
        double d = Math.pow(c,2);

        int e = 3 + 2;
        int f = e * 6;
        double g = Math.pow(f,2);
        int h = 3 * 2;
        var i = g / h;

        var j = i - d;
        var k = Math.pow(j,3);

        var l = Math.pow(10,3);
        double m = k / l;

        System.out.println("O resultado é: " + m);

    }
}

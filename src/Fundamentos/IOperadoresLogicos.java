package Fundamentos;

/* Os operadores lógicos funcionam através da tabela VERDADE de forma que:

e = "&&": V + V = V
          V + F = F
          F + V = F
          F + F = F

ou = "||": V + V = V
           V + F = V
           F + V = V
           F + F = F

ou/ou = "^": V + V = F
             V + F = V
             F + V = V
             F + F = F

negação = "!": !V = F
               !F = V
               !!V = V
               !!F = V                                                                                             */

public class IOperadoresLogicos {
    static void main(String[] args) {

        boolean condicao1 = 1 > 2;
        boolean condicao2 = 5 < 7;
        boolean condicao3 = true;
        boolean condicao4 = false;

        System.out.println(condicao2 && condicao3); //v + v = v
        System.out.println(condicao2 && condicao1); //v + f = f
        System.out.println(condicao1 && condicao2); //f + v = f
        System.out.println(condicao1 && condicao4); //f + f = f

        System.out.println(condicao2 || condicao3); //v + v = v
        System.out.println(condicao2 || condicao1); //v + f = v
        System.out.println(condicao1 || condicao2); //f + v = v
        System.out.println(condicao1 || condicao4); //f + f = f

        System.out.println(condicao2 ^ condicao3); //v + v = f
        System.out.println(condicao2 ^ condicao1); //v + f = v
        System.out.println(condicao1 ^ condicao2); //f + v = v
        System.out.println(condicao1 ^ condicao4); //f + f = f

    }
}

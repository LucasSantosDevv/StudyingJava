package Fundamentos;

/*  Os operadores relacioais são muito simples, basicamente se dividem em:
>  : maior
>= : maior ou igual
<  : menor
<= : menor ou igual
!= : diferente
    Através destes é possível criar diversas lógicas por associações e até misturá-los com demais operadores   */

import java.util.Scanner;

public class JOperadoresRelacionais {
    static void main(String[] args) {

        System.out.println("Boletim dos alunos\n\n");
        double notaMinima = 7;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota: ");
        String LucasNota = entrada.nextLine().replace(",", ".");
        double LucasNota1 = Double.parseDouble(LucasNota);
        System.out.println("O aluno teve bom comportamento? (sim/não) ");
        String LucasComportamento = entrada.nextLine().toLowerCase();

        if (LucasComportamento.equals("sim")) {
            LucasNota1 += 0.5;
        } else if (LucasComportamento.equals("não")) {
            LucasNota1 -= 0.5;
        }

        System.out.println("Insira a nota: ");
        String IsaNota = entrada.nextLine().replace(",", ".");
        double IsaNota1 = Double.parseDouble(IsaNota);
        System.out.println("O aluno teve bom comportamento? (sim/não) ");
        String IsaComportamento = entrada.nextLine().toLowerCase();

        if (IsaComportamento.equals("sim")) {
            IsaNota1 += 0.5;
        } else if (IsaComportamento.equals("não")) {
            IsaNota1 -= 0.5;
        }

        System.out.println("\n--- RESULTADOS ---");

        if (LucasNota1 >= notaMinima) {
            System.out.println("Lucas: Aprovado(a) com nota: " + LucasNota1);
        } else {
            System.out.println("Lucas: Reprovado(a) com nota: " + LucasNota1);
        }

        if (IsaNota1 >= notaMinima){
            System.out.println("Isa: Aprovado(a) com nota: " +IsaNota1);
        } else {
            System.out.println("Isa: Reprovado(a) com nota: " +IsaNota1);
        }

        entrada.close();
    }
}

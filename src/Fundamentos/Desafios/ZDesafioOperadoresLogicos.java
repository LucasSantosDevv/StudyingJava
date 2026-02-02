package Fundamentos.Desafios;

/* Desafio: Você pode receber dois trabalhos na próxima semana, porém nada confirmado ainda, caso receba ambos,
você irá ao 'shopping' comprar um tv de 50 polegadas e tomar sorvete, caso receba apenas um, comprará uma tv de
35 polegadas e tomará sorvete, caso receba nenhum, ficará sem sorvete e sem tv. Agora monte um sistema que represente
todos os cenários */

public class ZDesafioOperadoresLogicos {
    static void main(String[] args) {

    boolean trabalho1 = false;
    boolean trabalho2 = false; //aqui inserimos todas as variáveis

        if (trabalho1 && trabalho2){            //aqui fazemos a conjunção da verdade das variáveis
            System.out.println("TV 50 polegadas e sorvete");
        }

        if (!trabalho1 && trabalho2){           //aqui fazemos a conjunção da verdade sendo uma das variáveis negada
            System.out.println("TV 35 polegadas e sorvete");
        }

        if (trabalho1 && !trabalho2){           //aqui fazemos a conjunção da verdade sendo uma das variáveis negada
            System.out.println("TV 35 polegadas e sorvete");
        }

        if (!trabalho1 && !trabalho2){          //aqui fazemos a conjunção da verdade em ambas variáveis negadas
            System.out.println("ficaremos com fome e sem tv");
        }
    }
}

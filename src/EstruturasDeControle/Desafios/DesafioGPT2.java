package EstruturasDeControle.Desafios;

/* O programa começa com um saldo inicial fixo (por exemplo, 1000 reais).

Mostra um menu com as opções:

1 - Ver saldo
2 - Depositar
3 - Sacar
4 - Sair

1. O usuário digita a opção desejada.
2. Cada opção deve executar uma ação:
3. Ver saldo: mostra o saldo atual.
4. Depositar: pede um valor e soma ao saldo.
5. Sacar: pede um valor e subtrai do saldo, mas só se houver saldo suficiente.
6. Sair: encerra o programa com uma mensagem de despedida.
7. O programa deve repetir o menu até que o usuário escolha “4 - Sair”.                */

import java.util.Scanner;

public class DesafioGPT2 {
    static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

       double saldoOriginal = 1000;

       while (true){
           System.out.println("\n\nDigite o número desejado: \n\n1.Saldo \n2.Depositar \n3.Sacar \n4.sair");
           String menu = entrada.nextLine();

           if (menu.equals("4")){
               System.out.println("\n----------------\nTenha um bom dia");
               break;
           }

           if(menu.equals("1")){
               System.out.println("\n---------------------\nR$" + saldoOriginal);
               System.out.println("Deseja voltar ao menu (S/N)");
               String menu1 = entrada.nextLine().toLowerCase();
               if(menu1.equals("s")){
                   continue;
               }else{
                   System.out.println("\n----------------\nTenha um bom dia");
                   break;
               }
           }

           if(menu.equals("2")) {
               System.out.println("\nQuanto deseja depositar?");
               String DEPOSITO = entrada.nextLine().replace(",", ".");
               double deposito = Double.parseDouble(DEPOSITO);
               if(deposito > 0){
                   saldoOriginal += deposito;
               }else{
                   System.out.println("\nInsira um valor válido");
               }
               System.out.println("Deseja voltar ao menu (S/N)");
               String menu2 = entrada.nextLine().toLowerCase();
               if(menu2.equals("s")){
                   continue;
               }else{
                   System.out.println("\n----------------\nTenha um bom dia");
                   break;
               }
           }

           if(menu.equals("3")){
               System.out.println("\nQuanto deseja sacar?");
               String SAQUE = entrada.nextLine().replace(",",".");
               double saque = Double.parseDouble(SAQUE);
               if(saque <= saldoOriginal){
                   saldoOriginal -= saque;
               }else{
                   System.out.println("\nSeu saldo é insuficiente para a transação");
               }
               System.out.println("Deseja voltar ao menu (S/N)");
               String menu3 = entrada.nextLine().toLowerCase();
               if(menu3.equals("s")){
                   continue;
               }else{
                   System.out.println("\n----------------\nTenha um bom dia");
                   break;
               }
           }
       }
       entrada.close();
    }
}

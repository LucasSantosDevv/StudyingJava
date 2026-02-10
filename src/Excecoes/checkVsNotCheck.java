package Excecoes;
/*                                                  Throwable
                                (não tratáveis) Error ──├── Exception (tratáveis)
                                                  │             │
                            VirtualMachineError ──│             ├── RuntimeException (NÃO checadas)
                                   LinkageError ──│             │           ├── NullPointerException
                                 AssertionError ──│             │           ├── IllegalArgumentException
                                                                │           ├── IndexOutOfBoundsException
    O tratamento de erros em Java serve não apenas para         │           ├── ArithmeticException
corrigir problemas no desenvolvimento de projetos, mas          │           ├── ClassCastException
também para 'prevenir-se' de erros já esperados que irão        │           ├── UnsupportedOperationException
ocorrer. Dentro dos erros tratáveis temos dois tipos,           │           ├── ConcurrentModificationException
aqueles checados pelo Java e aqueles não checados, ambos        ├── IOException
podem quebrar o sistema se não tratados, mas enquanto um        ├── SQLException
terá problemas para compilar, o outro não.                      ├── ClassNotFoundException
                                                                ├── InterruptedException
                                                                ├── ParseException
                                                                ├── ReflectiveOperationException                */
public class checkVsNotCheck {

    public static void erroSaldoInsuficiente(){     //Exceção NÃO checada
        throw new RuntimeException("Saldo insuficiente para a transação");
    }
/* Exceção NÃO checada: ela não gerará problemas para compilar o projeto, porém quando o programa chegar nela irá
travar se não tiver sido tratado, e o seu tratamento ocorrerá somente na função 'main' do projeto, ao invés da
necessidade de ser jogado para outras funções encadeados ou de tratar nas mesmas                                */

    public static void erroDeConexao() throws Exception{        //Exceção checada
        throw new Exception("Erro ao conectar com a central do banco");
    }
/* Exceção checada: gerará incapacidade de compilação pelo Java, isso gera a necessidade de evidenciar na assinatura
do metodo que sabemos tratar-se de uma exceção verificada, e isso ocorre através do uso de "throws Exception". Por
ser verificada, quando tivermos um encadeamento de funções é necessário tratá-las ou 'jogar' para a próxima com o uso
do "throws Exception"
*/

    static void main(String[] args) {
        int saldo = 1500;
        int saque = 3000;
        boolean conexao = false;

        if (saldo < saque){
            try{
                erroSaldoInsuficiente();
            }
            catch (RuntimeException a){
                IO.println(a.getMessage());
            }
        }

        if (conexao == false){
            try{
                erroDeConexao();
            }
            catch (Throwable b){
                IO.println(b.getMessage());
            }
        }
    }
}

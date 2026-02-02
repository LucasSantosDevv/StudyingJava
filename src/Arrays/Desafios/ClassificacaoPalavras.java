package Arrays.Desafios;

public class ClassificacaoPalavras {
    static void main(String[] args) {

        String [] palavras = new String[10];
        palavras[0] = "Lucas";
        palavras[1] = "Celular";
        palavras[2] = "Dentista";
        palavras[3] = "Laboratório";
        palavras[4] = "Pneumoultramicroscopicossilicovulcanoconiótico";
        palavras[5] = "Dado";
        palavras[6] = "Computador";
        palavras[7] = "Carro";
        palavras[8] = "Oftalmotorrinolaringologista";
        palavras[9] = "Arara";

        int a = 1;
        int totalLetras = 0;

        for(String b : palavras){
            IO.println("Palavra " + a + ": " + b);
            a++;

            for(int i = 1; i <= b.length(); i++){       //For para contagem das letras
                totalLetras++;
            }

            IO.println("Número de totalLetras é: " + totalLetras);
            totalLetras = 0;    //Zeragem do número de letras
            char primeiraLetra = b.charAt(0);   //Metodo para saber a primeira letra
            char ultimaLetra = b.charAt(b.length() -1);     //Metodo para saber a última letra

            IO.println("A primeira letra é: " + primeiraLetra);
            IO.println("A última letra é: " + ultimaLetra + "\n");
        }
    }
}

package EstruturasDeControle.Desafios;

public class For {
    static void main(String[] args) {

        String valor = "#";
        for(int i = 1; i <= 10; i++){
            System.out.println(valor);
            valor += "#";
        }
        //DESAFIO: fazer o mesmo laço acima sem usar valores numéricos

        for(String v = "@"; !v.equals("@@@@@@@@@@@"); v += "@"){
            System.out.println(v);
        }

    }
}

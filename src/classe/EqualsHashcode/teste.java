package classe.EqualsHashcode;


public class teste {
    static void main(String[] args) {

        Usuarios p1 = new Usuarios(); //Usuário 1
        p1.nome = "Lucas";
        p1.email = "lucasdarochasantos@ymail.com";

        Usuarios p2 = new Usuarios(); //Usuário 1 duplicado
        p2.nome = "Lucas";
        p2.email = "lucasdarochasantos@ymail.com";

        Usuarios p3 = new Usuarios(); //Usuário 3
        p3.nome = "Odaisa";
        p3.email = "odaisarored@gmail.com";

        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p2)); /*Objeto duplicado identificado, uma fez que 'configuramos' o metodo equals
                                            para verificar o nome e o email ao invés do id do objeto */
    }
}

package classe.EqualsHashcode;

/* Dentro de um sistema complexo com muitos objetos, é normal acontecer de acabar tendo usuários, itens ou qualquer
outro tipo de objeto duplicado, porém é preciso eliminá-los para evitar desperdício de memória ou outros problemas,
mas como fazer?
________________________________________________________________________________________________________________________
1. == : o uso do '==' não é uma opção uma vez que ele apenas verifica se é o mesmo objeto na memória;
________________________________________________________________________________________________________________________
2. Equals: o uso do 'equals' pode dar conta deste problema, uma vez que podemos utilizá-lo para verificar endereços de
           memória, mas com dois cuidados importantes:
           a) Não podemos apenas pegar um objeto e fazer uma comparação direta com, por exemplo, p1.equals(p2). É
           necessário o uso de um metodo padrão Java como veremos a baixo;
           b) Em algum sistema que tenha centenas ou até milhares de objetos seria impossível usar tantos equal ao
           mesmo tempo, nesses casos usamos o hashcode;
________________________________________________________________________________________________________________________
3. Hashcode: o hashcode é normalmente usado como um filtro, para que elimine de forma geral tudo aquilo que não pode
             ser igual, permitindo que 'sobre' poucos ou até nenhum objeto para comparar, tornando (caso ainda seja
             necessário) o uso do equal possível mesmo que em sistema com muitos objetos.
_____________________________________________________________________________________________________________________ */

import java.util.Objects;

public class Usuarios {

    String nome;
    String email;

    @Override
    public boolean equals(Object o) {   //Metodo equals padrão Java;
        if (o == null || getClass() != o.getClass()) return false;  //Verifica se o object tem valor
        Usuarios usuarios = (Usuarios) o;   //Cria uma cópia para comparação
        return Objects.equals(nome, usuarios.nome) && Objects.equals(email, usuarios.email); //novos parâmetros
    }
}

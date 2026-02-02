package Fundamentos;

public class LEquals {
    static void main(String[] args) {

        var a = 3;
        var b = 4;
        var c = 3;
        String s1 = new String("3");

        System.out.println(c == a);
        System.out.println(c == b);
        System.out.println("3" == s1);
        System.out.println("3".equals(s1));

        //NÃO usar "==" para comparar 'string', usar '.equals'

    }
}

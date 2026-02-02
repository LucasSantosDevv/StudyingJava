package classe.Desafios;

public class StaticTeste {
    static void main(String[] args) {

        Static p1 = new Static("Galaxy S25 Ultra",6689.0);
        Static p2 = new Static("Samsung Buds 3 Pro", 1399.0);
        Static p3 = new Static("Galaxy Watch 8", 2879.1);

        double total = p1.precoCompra() + p2.precoCompra() + p3.precoCompra();
        double totalSemDesconto = p1.preco + p2.preco + p3.preco;

        System.out.printf(p1.nome + " R$%.2f", p1.precoCompra());
        System.out.printf("\n" + p2.nome + " R$%.2f", p2.precoCompra());
        System.out.printf("\n" + p3.nome + " R$%.2f", p3.precoCompra());
        System.out.println("\n\nO total é de: R$" + totalSemDesconto);
        System.out.println("O total a vista é de: R$" + total);
    }
}

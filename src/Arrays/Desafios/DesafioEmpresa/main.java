package Arrays.Desafios.DesafioEmpresa;

public class main {
    static void main(String[] args) {

        Funcionarios[] empregados = new Funcionarios[10];   //Criação do array

        empregados [0] = new Funcionarios("Lucas", 3500);
        empregados [1] = new Funcionarios("Odaísa", 4200);
        empregados [2] = new Funcionarios("Bruno", 5500);
        empregados [3] = new Funcionarios("Marcos", 2200);
        empregados [4] = new Funcionarios("Abel", 10000);
        empregados [5] = new Funcionarios("Amanda", 1500);
        empregados [6] = new Funcionarios("Pamela", 7250);
        empregados [7] = new Funcionarios("João", 6200);
        empregados [8] = new Funcionarios("Zé", 3900);
        empregados [9] = new Funcionarios("Luiz", 1700);

        double somaSalarial = 0;
        double mediaSalarial = 0;
        double maiorSalario = 0;
        double menorSalario = 3500;

        for(Funcionarios func : empregados){
            if(func.getSalario() > maiorSalario){
                maiorSalario = func.getSalario();
            }
            if(func.getSalario() < menorSalario){
                menorSalario = func.getSalario();
            }
            somaSalarial += func.getSalario();
            IO.println("Funcionário: " + func.getNome() + " salário: R$" + func.getSalario());
        }
            mediaSalarial = somaSalarial / empregados.length;
            IO.println();
            IO.println("A soma salarial da empresa é: R$" + somaSalarial);
            IO.println();
            IO.println("A média salarial da empresa é: R$" + mediaSalarial);
            IO.println();
            IO.println("O maior salário da empresa é: R$" + maiorSalario);
            IO.println();
            IO.println("A menor salário da empresa é: R$" + menorSalario);


    }
}

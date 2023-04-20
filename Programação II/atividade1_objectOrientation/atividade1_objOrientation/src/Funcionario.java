public class Funcionario {

    private String nome, sobrenome, CPF, cargo, gerente;
    private double salario;

    Funcionario(String nome, String sobrenome, String CPF, String cargo, String gerente, double salario){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.cargo = cargo;
        this.gerente = gerente;
        this.salario = salario;

    }

    public void setSalario(double salario){this.salario = salario;}
    public void setCargo(String cargo){this.cargo = cargo;}


    public void info(){

        System.out.printf("====================================================================================%n");
        System.out.printf("Nome do funcionario:" + this.nome + " " + this.sobrenome + "%n");
        System.out.printf("CPF:" + this.CPF + "%n");
        System.out.printf("Cargo:" + this.cargo + "%n");
        System.out.printf("Gerente:" + this.gerente + "%n");
        System.out.printf("Salario:" + this.salario + "%n");

    }
}

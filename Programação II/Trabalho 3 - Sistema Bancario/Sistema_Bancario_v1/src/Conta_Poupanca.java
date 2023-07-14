import java.util.Scanner;

public class Conta_Poupanca extends Conta_Bancaria{

    Scanner key = new Scanner(System.in);

    private double rendimento;
    private int SaqueMes;

    public Conta_Poupanca(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double rendimento, int saqueMes) {
        super(titular, banco, nroConta, saldo, senha);
        this.rendimento = rendimento;
        this.SaqueMes = 3;
    }

    public Conta_Poupanca() {

        this.SaqueMes = 3;
    }

    public void  Info(){
        System.out.println("Titular:" + this.titular );
        System.out.println("Banco:" + this.banco);
        System.out.println("Número da conta:" + this.nroConta);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Saques restantes:" + this.SaqueMes);
        System.out.println("Rendimento mensal (%):" + this.rendimento );
        System.out.println("Variação poupança:" );
    }

    public void NovoMes(){

    }
    public void Saque(){

        if (getSaqueMes() <= 0) {

            System.out.println("limite de saque atingido");

            return;
        }

        boolean senhaCorreta = VerificaSenha();
        if (senhaCorreta) {
            System.out.println("Senha correta");
            System.out.print("Valor a Sacar:");
            double valorSaque = key.nextDouble();

            if (valorSaque > getSaldo()){

                System.out.println("Saldo insuficiente");

            }else {

                setSaldo(getSaldo()-valorSaque);
                System.out.println("Saque efetuado com sucesso");

            }

        } else {
            System.out.println("Senha incorreta");
        }

    }
    public void Deposito(){

        Scanner key = new Scanner(System.in);

        boolean senhaCorreta = VerificaSenha();
        if (senhaCorreta) {
            System.out.println("Senha correta");
            System.out.print("Valor a depositar: ");
            double valorDeposito = key.nextDouble();

            if (valorDeposito <= 0) {
                System.out.println("Valor inválido para depósito");
            } else {
                setSaldo(getSaldo() + valorDeposito);
                System.out.println("Depósito efetuado com sucesso");
            }
        } else {
            System.out.println("Senha incorreta");
        }

    }

    /////////////////////////////////////////////////

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public int getSaqueMes() {
        return SaqueMes;
    }

    public void setSaqueMes(int saqueMes) {
        SaqueMes = saqueMes;
    }
}

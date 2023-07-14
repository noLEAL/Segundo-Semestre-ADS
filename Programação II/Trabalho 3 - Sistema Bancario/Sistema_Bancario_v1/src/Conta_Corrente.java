import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Conta_Corrente extends Conta_Bancaria {

    Scanner key = new Scanner(System.in);

    private double TaxMes;

    public Conta_Corrente(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double taxMes) {
        super(titular, banco, nroConta, saldo, senha);
        this.TaxMes = taxMes;
    }

    public Conta_Corrente() {

    }

    public void Saque(){

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

    public void Info(){

        System.out.println("Titular:" + this.titular );
        System.out.println("Banco:" + this.banco);
        System.out.println("Número da conta:" + this.nroConta);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Taxa ao Mês" + this.TaxMes);

    }
    public void NovoMes(ArrayList<Conta_Corrente> array_corrente){
        System.out.println("TAXA:" + this.TaxMes);

        for(Conta_Corrente conta: array_corrente ) {

            setSaldo(getSaldo()-this.TaxMes);

        }

    }
    /////////////////////////////////////////////////////
    public double getTaxMes() {
        return TaxMes;
    }
    public void setTaxMes(double taxMes) {
        TaxMes = taxMes;
    }
}

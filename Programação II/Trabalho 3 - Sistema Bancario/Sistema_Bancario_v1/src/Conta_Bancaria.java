import java.util.Scanner;

public abstract class Conta_Bancaria {

    protected Pessoa titular;
    protected Banco banco;
    protected int nroConta;
    protected double saldo;
    protected String senha;

    public Conta_Bancaria(Pessoa titular, Banco banco, int nroConta, double saldo, String senha) {
        this.titular = titular;
        this.banco = banco;
        this.nroConta = nroConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public Conta_Bancaria() {

    }

    public abstract void Saque();

    public abstract void Deposito();

    public boolean VerificaSenha(int verSenha){

        String convert = verSenha + "";

        if (this.senha.equals(convert)){
            return true;
        }else {
            return false;
        }

    }

    public boolean VerificaSenha(){

        Scanner key = new Scanner(System.in);
        System.out.print("Digite a senha da conta: ");
        String senhaDigitada = key.nextLine();

        return this.senha.equals(senhaDigitada);

    }
    /////////////////////////////////////////////////////////////////
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  "Tipo: " + this.titular.getNome() +
                ", \nBanco: " + this.banco.getNome() +
                ", \nNúmero da Conta: " + this.nroConta +
                ", \nSaldo: " + this.saldo;

    }



}

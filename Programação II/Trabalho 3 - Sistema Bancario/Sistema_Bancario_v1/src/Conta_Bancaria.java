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

   public void Deposito(){

    }

    public boolean VerificaSenha(String verSenha){

        if () {
            return true;
        }else {
            return false;
        }
    }

    public void Saque(){

    }



}

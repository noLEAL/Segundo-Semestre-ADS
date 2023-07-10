public class Conta_Poupanca extends Conta_Bancaria{

    private double rendimento;
    private int SaqueMes;

    public Conta_Poupanca(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double rendimento, int saqueMes) {
        super(titular, banco, nroConta, saldo, senha);
        this.rendimento = rendimento;
        this.SaqueMes = saqueMes;
    }

    public void  Info(){
        System.out.println("Titular:" + this.titular );
        System.out.println("Banco:" + this.banco);
        System.out.println("Número da conta:" + this.nroConta);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Saques restantes:" + this.SaqueMes);
        System.out.println("Rendimento mensal (%):" + this.rendimento );
        System.out.println("Variação poupança:");
    }

    public void NovoMes(){

    }

    public void Saque(){


    }
}

public class Conta_Poupança extends Conta_Bancaria{

    private double rendimento;
    private int SaqueMes;

    public Conta_Poupança(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double rendimento, int saqueMes) {
        super(titular, banco, nroConta, saldo, senha);
        this.rendimento = rendimento;
        this.SaqueMes = saqueMes;
    }

    public void  Info(){
        System.out.println("Titular:" + this.titular );
        System.out.println("" + this.banco);
        System.out.println("" + this.nroConta);
        System.out.println("" + super.saldo);
        System.out.println("" + this.senha);
        System.out.println("Rendimento:" + this.rendimento );
        System.out.println("Saque p/ Mês:" + this.SaqueMes);
    }
}

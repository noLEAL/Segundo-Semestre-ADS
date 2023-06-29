public class Conta_Corrente extends Conta_Bancaria {

    private double TaxMes;

    public Conta_Corrente(Pessoa titular, Banco banco, int nroConta, double saldo, String senha, double taxMes) {
        super(titular, banco, nroConta, saldo, senha);
        this.TaxMes = taxMes;
    }

    public void Info(){

        System.out.println();


    }

    public void NovoMes(){

    }

}

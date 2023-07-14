import java.util.ArrayList;

public class Banco {

    private String nome;
    private String cNPJ;
    private int nroBanco;
    private ArrayList<Conta_Bancaria> ContasBancarias =  new ArrayList<>();

    public Banco(String nome, String cNPJ, int nroBanco) {
        this.nome = nome;
        this.cNPJ = cNPJ;
        this.nroBanco = nroBanco;
        //ContasBancarias = contasBancarias;
    }

    public Banco() {

    }

    void infoBanco(){

        System.out.println("Nome do Banco:" + this.getNome());
        System.out.println("CNPJ Banco:" + this.getCNPJ() );
        System.out.println("Número Banco:" + this.getNroBanco());

    }

    void fecharConta(){

    }
    void infoContas(){

        System.out.println(ContasBancarias);

    }
    void criarConta(Conta_Bancaria contaBanco){

        ContasBancarias.add(contaBanco);

    }

    ////////////////////////////////////////////////////////////////////////

    public ArrayList<Conta_Bancaria> getContasBancarias() {
        return ContasBancarias;
    }
    public void setContasBancarias(Conta_Poupanca setPolpa) {
        ContasBancarias.add(setPolpa);
    }
    public void setContasBancarias(Conta_Corrente setCorrent) {
        ContasBancarias.add(setCorrent);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCNPJ() {
        return cNPJ;
    }
    public void setCNPJ(String cNPJ) {
        this.cNPJ = cNPJ;
    }
    public int getNroBanco() {
        return nroBanco;
    }
    public void setNroBanco(int nroBanco) {
        this.nroBanco = nroBanco;
    }

    @Override
    public String toString() {
        return nome;
    }
}

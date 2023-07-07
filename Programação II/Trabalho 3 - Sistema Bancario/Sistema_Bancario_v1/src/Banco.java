import java.util.ArrayList;

public class Banco {

    private String nome;

    private String cNPJ;

    private int nroBanco;
    private ArrayList<Conta_Bancaria> ContasBancarias =  new ArrayList<>();

    ArrayList<Banco> array_bancos = new ArrayList<>();
    Banco(){

    }

    public Banco getBanco(int numeroBanco) {

        for (Banco nrBanco : array_bancos) {

            if (numeroBanco == nrBanco.getNroBanco()) {

                int indice = array_bancos.indexOf(nrBanco);

                return array_bancos.get(indice);

            } else {

                System.out.println("Numero do banco não encontrado, tente outro.");

            }
        }
        return null;
    }

    public void setBancos(Banco banco){

        array_bancos.add(banco);

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

    //=============================================================
    void infoBanco(){

        System.out.println("Nome do Banco:" + this.getNome());
        System.out.println("CNPJ Banco:" + this.getCNPJ() );
        System.out.println("Número Banco:" + this.getNroBanco());

    }
    void infoContas(){




    }
    void criarConta(){

    }
    void fecharConta(){

    }

}

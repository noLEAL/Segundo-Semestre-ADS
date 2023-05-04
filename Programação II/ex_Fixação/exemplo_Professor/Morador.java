public class Morador extends Pessoa{

    String torre;
    int nrAP;
    Veiculo veiculo;

    Morador (String nomeCompleto, String CPF, String torre, int nrAP){
        super(nomeCompleto, CPF);
        this.torre = torre;
        this.nrAP = nrAP;
        this.veiculo = null;
    }

    Morador (String nomeCompleto, String CPF, String torre, int nrAP, Veiculo veiculo){
        super(nomeCompleto, CPF);
        this.torre = torre;
        this.nrAP = nrAP;
        this.veiculo = veiculo;
        this.veiculo.novoDono(this);
    }

    public void Info(){
        System.out.println("Informacoes de Morador");
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Ap: " + this.torre + this.nrAP);
        System.out.println();
    }
}

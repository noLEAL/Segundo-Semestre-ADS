public class Morador extends Pessoas {

    String torre;
    int numeroAP;

    Morador(String nomeCompleto, String CPF, String torre, int numeroAP){

        super(nomeCompleto, CPF);
        this.torre = torre;
        this.numeroAP = numeroAP;

    }

    public void Info(){
        System.out.println("Informacoes de Morador");
        System.out.println("Nome: " + this.nomePessoas);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Torre:" + this.torre + "Número Apartamento:"+ this.numeroAP);
        System.out.println();
    }

}

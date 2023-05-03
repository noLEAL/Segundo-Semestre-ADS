public class Pessoa {
    String nomeCompleto, CPF;

    Pessoa (String nomeCompleto, String CPF){
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
    }

    public void Info(){
        System.out.println("Informacoes de Morador");
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println();
    }
}

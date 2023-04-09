public class Colaborador extends Pessoa{
    String funcao;
    String turnoDeTrabalho;

    Colaborador (String nomeCompleto, String CPF, String funcao, String turnoDeTrabalho){
        super(nomeCompleto, CPF);
        this.funcao = funcao;
        this.turnoDeTrabalho = turnoDeTrabalho;
    }

    public void Info(){
        System.out.println("Informacoes de Colaborador");
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("Funcao: " + this.funcao);
        System.out.println("Turno: " + this.turnoDeTrabalho);
        System.out.println();
    }

}

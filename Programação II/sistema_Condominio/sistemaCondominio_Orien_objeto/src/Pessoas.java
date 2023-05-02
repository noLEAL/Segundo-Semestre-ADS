public class Pessoas {

    String nomePessoas, CPF;

     Pessoas(String nomePessoas, String CPF){

        this.nomePessoas = nomePessoas;
        this.CPF = CPF;

    }

    public void Info(){

        System.out.printf("Informações pessoas");
        System.out.printf("Nome:" + this.nomePessoas);
        System.out.printf("CPF:" + CPF);


    }


}

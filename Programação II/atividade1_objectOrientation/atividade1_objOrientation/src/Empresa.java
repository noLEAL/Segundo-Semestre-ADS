public class Empresa {

    String nomeEmpresa, CNPJ, endereco, servico;

    Empresa(String nomeEmpresa, String CNPJ, String endereco, String servico){

        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.servico = servico;

    }

    public void info(){

        System.out.printf("====================================================================================%n");
        System.out.printf("Dados da empresa:" + this.nomeEmpresa + "%n");
        System.out.printf("CNPJ:" + this.CNPJ + "%n");
        System.out.printf("Endereço:" + this.endereco + "%n");
        System.out.printf("Serviço:" + this.servico + "%n");


    }


}

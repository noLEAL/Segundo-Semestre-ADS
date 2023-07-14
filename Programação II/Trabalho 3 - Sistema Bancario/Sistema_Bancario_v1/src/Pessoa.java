import java.util.ArrayList;

public class Pessoa  {

    public String nome;
    public String sobrenome;
    int idade;
    private String cpf;
    private ArrayList<Conta_Bancaria> ContasBancarias =  new ArrayList<>();

    public Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {

    }

    public void Info(){

        System.out.println("=".repeat(100));
        System.out.println("Titular:" + this.getNome() + this.getSobrenome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("CPF:" + this.getCpf());
        if (this.getContasBancarias().size() > 0 ){
            System.out.println("Contas:" + this.getContasBancarias());
        }else {
            System.out.println("Sem contas Cadastradas.");
        }
        System.out.println("=".repeat(100));

    }
    public void InfoContas(){

        System.out.println("Esse cliente possui: " + this.getContasBancarias());

    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public ArrayList<Conta_Bancaria> getContasBancarias() {
        return this.ContasBancarias;
    }
    public void setContasBancarias(Conta_Bancaria contaPessoa) {
        this.ContasBancarias.add(contaPessoa);
    }
    @Override
    public String toString() {
        return nome + sobrenome;
    }
}


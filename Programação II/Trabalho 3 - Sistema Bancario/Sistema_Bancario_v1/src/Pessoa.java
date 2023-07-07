import java.util.ArrayList;

public class Pessoa  {

    public String nome;
    public String sobrenome;
    int idade;
    private String cpf;
    private ArrayList<Conta_Bancaria> ContasBancarias =  new ArrayList<>();
    ArrayList<Pessoa> array_clietes = new ArrayList<>();
    public Pessoa() {

    }

    public Pessoa getClientes(int indice){

        return array_clietes.get(indice);
    }

    public void setClientes(Pessoa cliente){

        array_clietes.add(cliente);

    }

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
        return ContasBancarias;
    }

    public void setContasBancarias(ArrayList<Conta_Bancaria> contasBancarias) {
        ContasBancarias = contasBancarias;
    }
    public void info(){

        System.out.println("Titular:" + this.getNome() + this.getSobrenome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("CPF:" + this.getCpf());
        if (this.getContasBancarias().size() > 0 ){
            System.out.println("Contas:" + this.getContasBancarias());
        }else {
            System.out.println("Sem contas Cadastradas.");
        }

    }
}

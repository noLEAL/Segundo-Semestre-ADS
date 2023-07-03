import java.util.ArrayList;

public class Pessoa {

    private String nome_completo;
    private int CPF;
    private String endereco;
    private ArrayList<Integer> telefones;
    private String email;

    public Pessoa(String nome_completo, int CPF, String endereco, ArrayList<Integer> telefones, String email) {
        this.nome_completo = nome_completo;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefones = new ArrayList<>(telefones);
        this.email = email;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public ArrayList<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Integer> telefones) {
        this.telefones = telefones;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void info_pessoa(){

        System.out.println("nome:" +  this.nome_completo);
        System.out.println("cpf:" + this.CPF);
        System.out.println("enderecopessoa:" + this.endereco);
        System.out.println("telefonepessoa:" + getTelefones());
        System.out.println("emailpessoa:" + email);

    }

    void info_contato(){



    }

}

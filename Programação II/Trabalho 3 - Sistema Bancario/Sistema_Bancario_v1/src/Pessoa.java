public class Pessoa  {

    public String nome;
    public String sobrenome;
    int idade;
    private String cpf;
    //private Conta_Bancaria;
    public String Titular = nome + sobrenome;


    public Pessoa(String Titular, int idade, String cpf) {
        this.Titular = Titular;
        this.idade = idade;
        this.cpf = cpf;
    }
    public void Info(){

        System.out.println("Titular:" + (this.nome + this.sobrenome));
        System.out.println("Idade:" + this.idade );
        System.out.println("CPF:" + this.cpf );

    }
}

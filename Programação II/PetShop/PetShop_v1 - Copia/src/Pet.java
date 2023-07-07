import java.util.ArrayList;

public class Pet {
    private String especie;

    private String raca;
    private String nome;
    private int idade;
    private ArrayList<Tutor> tutores;

    private Tutor tutoresref;

    public Pet(String especie, String raca, String nome, int idade, Tutor tutoresref) {
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        tutores = new ArrayList<Tutor>();
        tutores.add(tutoresref);
    }

    public Pet(String especie, String raca, String nome, int idade) {
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public ArrayList<Tutor> getTutores() {
        return tutores;
    }
    public void setTutores(ArrayList<Tutor> tutores) {
        this.tutores = tutores;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Tutor getTutoresref() {
        return tutoresref;
    }

    public void setTutoresref(Tutor tutoresref) {
        this.tutoresref = tutoresref;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

     void info_pet(){

         System.out.println("nome:" + this.nome);
         System.out.println("especie:" + this.especie);
         System.out.println("raca:" + this.raca);
         System.out.println("idade:" + this.idade);

     }
     void info_tutores(){

         System.out.println("tutores pet:" + getTutoresref());

     }
}

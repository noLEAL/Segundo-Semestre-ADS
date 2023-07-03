import java.util.ArrayList;

public class Tutor extends Pessoa {

    private ArrayList<Pet> pets;

    private Pet petref;


    public Tutor(String nome_completo, int CPF, String endereco, ArrayList<Integer> telefones, String email, Pet petref) {
        super(nome_completo, CPF, endereco, telefones, email);
        pets = new ArrayList<Pet>();
        pets.add(petref);
    }

    public Tutor(String nome_completo, int CPF, String endereco, ArrayList<Integer> telefones, String email) {
        super(nome_completo, CPF, endereco, telefones, email);

    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    public Pet getPetref() {
        return petref;
    }

    public void setPetref(Pet petref) {
        this.petref = petref;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    void info_tutor(){
        System.out.println("nome:" + getNome_completo());
        System.out.println("cpf:" + getCPF());
        System.out.println("endereco:" + getEndereco());
        System.out.println("email:" + getEmail());

    }
    void info_pets(){

        System.out.println("pet-tutor:" + getPetref());

    }


}

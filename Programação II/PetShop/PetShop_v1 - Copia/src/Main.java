import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio");


        ArrayList<Integer> telefoneP = new ArrayList<>();
        telefoneP.add(21345);
        telefoneP.add(54321);

       // Pessoa pessoa = new Pessoa("pessoa", 123123,"endereço-pessoa",telefoneP,"email-pessoa");
        Pet pet = new Pet("especi","raca","nome-pet",12);
        Tutor tutor = new Tutor("tutor",123,"endereço-tutor",telefoneP,"email-tutor");
        System.out.println("====");
        pet.info_pet();
        System.out.println("====");
        tutor.info_tutor();
        System.out.println("====");
//        pessoa.info_pessoa();
//        System.out.println("====");


    System.out.println("Final");
    }
}
import java.util.Random;
import static java.lang.Math.addExact;

public class classeVetor {


    int vetorInterno [];

    classeVetor(int tam){

        vetorInterno = new int[tam];

    }

    public int preenchedor_Aleatorio(){

        int numR, aux;
        Random random = new Random();

        aux = 0;

        for(int i = 0; i < vetorInterno; i++){

            aux++;
            numR = random.nextInt(100);

            if(numR == 0 ){

                vetorInterno = addExact(aux,aux-1); //soma inteiro

            }else {

                vetorInterno = numR;
            }


    }
}

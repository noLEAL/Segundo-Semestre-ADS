//GENARIZAÇÃO

public class classeVetor {

    int vetorInterno[];

    //metodo para criar o vetor   
    public classeVetor(int tam){

        this.vetorInterno = new int[tam];


    }
    //segundo metodo construtor para zerar o vetor
    public classeVetor(int tam, int padrao){

        this.vetorInterno = new int[tam];
        for (int i = 0; i < tam;vetorInterno[i++]=padrao);



    }





}

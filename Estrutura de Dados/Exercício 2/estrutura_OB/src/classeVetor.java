import java.util.Random;


public class classeVetor {

    int[] vetorInterno;  // definição do vetor interno
    int esquerda,direita;

    classeVetor(int tam) { // metodo contrutor

        vetorInterno = new int[tam];

    }

    public int[] getVetor() {
        return vetorInterno;
    }

    public void preenchedor_Aleatorio() {

        Random rand = new Random();

        int tamVetor;

        tamVetor = vetorInterno.length;

        int[] numeros = new int[tamVetor * 10];

        for (int i = 0; i < vetorInterno.length; i++) {

            int num;
            do {
                num = rand.nextInt(tamVetor * 10); // Gera um número entre 0 e 10N-1
            } while (numeros[num] != 0); // Verifica se o número já foi sorteado
            numeros[num] = 1; // Marca o número como sorteado
            vetorInterno[i] = num;

        }
    }  // OK

    public void crecente_Aleatorio() {

            int numR, aux;
            Random random = new Random();

            aux = 0;

            for(int i = 0; i < vetorInterno.length; i++){

                numR = random.nextInt(100);


                if (numR != 0 /*&& numR != vetorInterno[i-1]*/){

                    aux += numR;

                }

                vetorInterno[i] = aux+1;

            }

    }  //OK

    public void elementos_Validos(){

            int flag = 0;

            for(int i = 0; i < vetorInterno.length; i++) {

                if(vetorInterno[i] != 0 ) {

                    flag++;

                }

            }

            System.out.println("Existem " + flag + " valores significativos." );

    } //OK

    public void menor_Maior(){

            int maior,flag,menor;

            maior = vetorInterno[0];
            flag = 0;
            for (int i = 0; i < vetorInterno.length; i++) {
                if (vetorInterno[i] > maior) {
                    maior = vetorInterno[i];
                    flag = i;
                }
            }
            System.out.printf("Maior número é %d, no índice %d%n", maior, flag);

            flag = 0;
            menor = vetorInterno[0];

            for (int i = 0; i < vetorInterno.length; i++) {
                if (vetorInterno[i] < menor) {
                    menor = vetorInterno[i];
                    flag = i;
                }
            }
            System.out.printf("menor número é %d, no índice %d%n8", menor, flag);

    } //OK

    public void info(){

        for (int j : vetorInterno) {

            System.out.printf(" [%d] ", j);

        }

    } //OK

    public void insert_Valor(int valor, int stance){

        vetorInterno[stance] = valor;

    } //OK

    public void apagar_Valor(int apagar){



            if (apagar != 0 ) {

                for(int i= 0; i < vetorInterno.length; i++) {
                    if(apagar == vetorInterno[i]){
                        vetorInterno[i] = 0;
                    }
                }

            } else {

                System.out.println("Valor não encontrado ou NULO");

            }

    } //OK

    public void apagar_Indice(int indice){

        vetorInterno[indice] = 0;

    }

    public void busca_Sequencial(int varBusca){

        for (int i = 0; i < vetorInterno.length ; i++) {

            if (vetorInterno[i] == varBusca) {

                System.out.printf("Valor %d encontrado no indice %d %n",vetorInterno[i], i );

            }
        }

    }

    public int busca_Binaria (int[] lista, int chave, int esquerda, int direita) {


        if (esquerda > direita) {
            System.out.println("vetor não ordenado idiota");
            return -1;
        }

        int meio = (esquerda + direita) / 2;

        if (lista[meio] == chave) {
            return meio;
        } else if (chave < lista[meio]) {
            return busca_Binaria(lista, chave, esquerda, meio - 1);
        } else {
            return busca_Binaria(lista, chave, meio + 1, direita);
        }

    }

    public void Bubblesort(){

        boolean troca;

        for (int i = 0; i < vetorInterno.length-1; i++) {
            troca = false;
            for (int j = 0; j < vetorInterno.length-1 - i - 1; j++) {
                if (vetorInterno[j] > vetorInterno[j + 1]) {
                    int aux = vetorInterno[j];
                    vetorInterno[j] = vetorInterno[j + 1];  //momento que inverte com a ajuda da aux
                    vetorInterno[j + 1] = aux;           //momento que inverte com a ajuda da aux
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
    }

    public void Insertionsort(){

        for (int i = 1; i < vetorInterno.length; i++) {
            int aux = vetorInterno[i];
            int j = i - 1;
            while (j >= 0 && vetorInterno[j] > aux) {
                vetorInterno[j + 1] = vetorInterno[j];
                j--;
            }
            vetorInterno[j + 1] = aux;
        }



    }

    public void Selectionsort(){


        for (int i = 0; i < vetorInterno.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetorInterno.length; j++) {
                if (vetorInterno[j] < vetorInterno[min]) {
                    min = j;
                }
            }
            int aux = vetorInterno[min];
            vetorInterno[min] = vetorInterno[i];
            vetorInterno[i] = aux;
        }
    }

    public void Quicksort(int [] vetorInterno,int esquerda, int direita){

        int i = esquerda;
        int j = direita;
        int meio = vetorInterno[(esquerda + direita) / 2];
        int temp;

        while (i <= j) {
            while (vetorInterno[i] < meio) {
                i++;
            }
            while (vetorInterno[j] > meio) {
                j--;
            }
            if (i <= j) {
                temp = vetorInterno[i];
                vetorInterno[i] = vetorInterno[j];
                vetorInterno[j] = temp;
                i++;
                j--;
            }
        }
        if (esquerda < j) {
            Quicksort(vetorInterno, esquerda, j);
        }
        if (i < direita) {
            Quicksort(vetorInterno, i, direita);
        }

    }

}

import java.util.Random;


public class classeVetor {

    int[] vetorInterno;  // definição do vetor interno

    classeVetor(int tam) { // metodo contrutor

        vetorInterno = new int[tam];

    }

    public int[] getVetor() {
        return vetorInterno;
    }

    public void preenchedor_Aleatorio() {

        int numR,numR2, aux;
        Random random = new Random();

        aux = 0;

        for (int i = 0; i < vetorInterno.length; i++) {

            aux++;
            numR = random.nextInt(100);

            if (numR == 0) {

                vetorInterno[i] = vetorInterno[numR2 = random.nextInt(100)] + 1;

            } else {

                vetorInterno[i] = numR;

            }


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

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int opition,size;
        classeVetor myObject;

        System.out.println("Qual tamanho do vetor:");
        size = key.nextInt();
        myObject = new classeVetor(size);

        while(true) {

            System.out.println("=".repeat(100));

            System.out.println("1. Preencher o vetor do objeto com números pseudo-randômicos, em uma distribuição que minimize a possibilidade de valores duplicados."); //OK
            System.out.println("2. Preencher o vetor do objeto com números pseudo-randômicos em ordem crescente");
            System.out.println("3. Informar o total de elementos válidos no vetor do objeto");
            System.out.println("4. Informar o maior e o menor valores existentes no vetor do objeto");
            System.out.println("5. Listar todo o conteúdo do vetor do objeto");
            System.out.println("6. Inserir um valor no vetor do objeto em uma determinada posição.");
            System.out.println("7. Apagar um valor do vetor do objeto, informando o valor a ser removido");
            System.out.println("8. Apagar um valor do vetor do objeto, informando a posição do valor a ser removido.");
            System.out.println("9. Consultar a existência de um valor no vetor do objeto, utilizando busca sequencial");
            System.out.println("10. Consultar a existência de um valor no vetor do objeto, utilizando busca binária");
            System.out.println("11. Ordenar o vetor do objeto, utilizando o método Bubblesort");
            System.out.println("12. Ordenar o vetor do objeto, utilizando o método Insertionsort");
            System.out.println("13. Ordenar o vetor do objeto, utilizando o método Selectionsort");
            System.out.println("14. Ordenar o vetor do objeto, utilizando o método Quicksort");

            System.out.println("=".repeat(100));

            opition = key.nextInt();


            switch (opition){
                case 1:

                    myObject.preenchedor_Aleatorio(); // OK

                    break;
                case 2:

                    myObject.crecente_Aleatorio();

                    break;
                case 3:
                    myObject.elementos_Validos();

                    break;
                case 4:

                    myObject.menor_Maior();

                    break;
                case 5:

                    myObject.info();
                    System.out.println("");

                    break;
                case 6:

                    int valor,stance;

                    System.out.println("Qual valor que deseja inserir:");
                    valor = key.nextInt();
                    System.out.println("Em qual indice deseja inserir:");
                    stance = key.nextInt();
                    myObject.insert_Valor(valor, stance);

                    break;
                case 7:

                    int apagar;

                    System.out.println("Qual valor que deseja apagar:");
                    apagar = key.nextInt();
                    myObject.apagar_Valor(apagar);

                    break;
                case 8:

                    int indice;

                    System.out.println("Qual indice que deseja apagar:");
                    indice = key.nextInt();
                    myObject.apagar_Indice(indice);

                    break;
                case 9:

                    int varBusca = 0;

                    System.out.println("Qual valor deseja buscar::");
                    varBusca = key.nextInt();

                    myObject.busca_Sequencial(varBusca);

                    break;
                case 10:

                    int chave,resultado;

                    int[] vetortest;

                    vetortest = myObject.getVetor();

                    System.out.println("Qual valor deseja buscar:");
                    chave = key.nextInt();

                    resultado = myObject.busca_Binaria(myObject.getVetor(),chave,0,vetortest.length-1 );

                    if (resultado == -1) {
                        System.out.println("Elemento não encontrado:");
                    } else {
                        System.out.println("Elemento encontrado no índice: " + resultado);
                    }

                    break;
                case 11:

                    myObject.Bubblesort();

                    break;
                case 12:

                    myObject.Insertionsort();

                    break;
                case 13:

                    myObject.Selectionsort();

                    break;
                case 14:

                     int[] vetortestQ;

                     vetortestQ = myObject.getVetor();

                     myObject.Quicksort(myObject.getVetor(),0,vetortestQ.length-1);

                    break;
                default:

                    System.out.println("idiota");

                    break;
            }


        }

    }
}
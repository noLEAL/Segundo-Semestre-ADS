import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);

        ArrayList<String> entradaStringA = new ArrayList<>();

        entradaStringA.add("A");
        entradaStringA.add("B");
        entradaStringA.add("C");
        entradaStringA.add("A");
        entradaStringA.add("A");
        entradaStringA.add("B");
        entradaStringA.add("B");
        entradaStringA.add("C");
        entradaStringA.add("A");
        entradaStringA.add("D");
        entradaStringA.add("E");
        entradaStringA.add("F");
        entradaStringA.add("B");
        entradaStringA.add("A");
        entradaStringA.add("B");
        entradaStringA.add("C");
        entradaStringA.add("D");

        ArrayList<String> entradaStringB = new ArrayList<>();

        entradaStringB.add("A");
        entradaStringB.add("D");
        entradaStringB.add("C");
        entradaStringB.add("B");
        entradaStringB.add("A");
        entradaStringB.add("B");
        entradaStringB.add("D");
        entradaStringB.add("C");
        entradaStringB.add("A");
        entradaStringB.add("D");
        entradaStringB.add("E");
        entradaStringB.add("F");
        entradaStringB.add("B");
        entradaStringB.add("A");
        entradaStringB.add("F");
        entradaStringB.add("C");
        entradaStringB.add("D");

        ArrayList<String> entradaStringC = new ArrayList<>();


        entradaStringC.add("A");
        entradaStringC.add("D");
        entradaStringC.add("C");
        entradaStringC.add("B");
        entradaStringC.add("A");
        entradaStringC.add("B");
        entradaStringC.add("D");
        entradaStringC.add("C");
        entradaStringC.add("A");
        entradaStringC.add("D");
        entradaStringC.add("E");
        entradaStringC.add("F");
        entradaStringC.add("B");
        entradaStringC.add("A");
        entradaStringC.add("F");
        entradaStringC.add("C");
        entradaStringC.add("D");
        entradaStringC.add("A");
        entradaStringC.add("B");
        entradaStringC.add("C");
        entradaStringC.add("A");
        entradaStringC.add("A");
        entradaStringC.add("B");
        entradaStringC.add("B");
        entradaStringC.add("C");
        entradaStringC.add("A");
        entradaStringC.add("D");
        entradaStringC.add("E");
        entradaStringC.add("F");
        entradaStringC.add("B");
        entradaStringC.add("C");
        entradaStringC.add("D");
        entradaStringC.add("C");
        entradaStringC.add("D");



        while(true) {

            System.out.println("=".repeat(100));

            System.out.println("Escolha qual metodo de substituição que deseja usar ");

            System.out.println("(1) FIFO");
            System.out.println("(2) LRU");
            System.out.println("(3) FRU");

            System.out.println("(0) Encerrar atividades");

            System.out.println("=".repeat(100));

            int escolha = key.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("(1) FIFO");

                    System.out.println("Qual das entradas que você deseja usar:");

                    System.out.printf("(1)");
                    System.out.println(entradaStringA);

                    System.out.printf("(2)");
                    System.out.println(entradaStringB);

                    System.out.printf("(3)");
                    System.out.println(entradaStringC);

                    int entrada = key.nextInt();

                    if (entrada == 1){

                        FIFO(entradaStringA);

                    }

                    if (entrada == 2) {

                        FIFO(entradaStringB);

                    }

                    if (entrada ==3){

                        FIFO(entradaStringC);

                    }

                    break;
                case 2:
                    System.out.println("(2) LRU");

                    System.out.println("Qual das entradas que você deseja usar:");

                    System.out.printf("(1)");
                    System.out.println(entradaStringA);

                    System.out.printf("(2)");
                    System.out.println(entradaStringB);

                    System.out.printf("(3)");
                    System.out.println(entradaStringC);

                    int entrada1 = key.nextInt();

                    if (entrada1 == 1){

                        LRU(entradaStringA);

                    }

                    if (entrada1 == 2) {

                        FIFO(entradaStringB);

                    }

                    if (entrada1 ==3){

                        FIFO(entradaStringC);

                    }

                    if (entrada1 != 1 && entrada1 != 2 && entrada1 != 3){

                        System.out.println("Você é burro ");

                    }

                    break;
                case 3:
                    System.out.println("(3) FRU");

                    System.out.println("Qual das entradas que você deseja usar:");

                    System.out.printf("(1)");
                    System.out.println(entradaStringA);

                    System.out.printf("(2)");
                    System.out.println(entradaStringB);

                    System.out.printf("(3)");
                    System.out.println(entradaStringC);

                    int entrada2 = key.nextInt();

                    if (entrada2 == 1){

                        LFU(entradaStringA);

                    }

                    if (entrada2 == 2) {

                        LFU(entradaStringB);

                    }

                    if (entrada2 ==3){

                        LFU(entradaStringC);

                    }

                    break;
                case 0:

                    System.exit(1);

                    break;
                default:

                    System.out.println("Tente novamente");

                    break;


            }
        }
    }

    public static void FIFO( ArrayList<String> lista){

        System.out.println("-".repeat(100));

        System.out.println(lista);

        System.out.println(".".repeat(100));

        int tamanhoCache = 4;

        ArrayList<String> cache = new ArrayList(4);

        int contMiss = 0;
        int contHit = 0;

        for (String dado : lista) {

            System.out.printf("ESSE É O DADO: <%s> \n",  dado);

            if (cache.contains(dado)) {
                System.out.println("O dado: " + dado + " já está na cache. [MISS:" + contMiss +"]");
                contMiss++;
                continue;
            }

            if (cache.size() >= tamanhoCache) {

                System.out.println("CACHE ESTA CHEIO!!!");

                System.out.println(cache);
                String limpar = cache.remove(0);

                System.out.println(cache);

                //System.out.println("O Dado " + limpar + " foi removida da cache.");


            }

            cache.add(dado);
            contHit ++;
            System.out.println("O Dado " + dado + " foi adicionada à cache.");

            System.out.println("Conteúdo atual da cache:");
            for (String p : cache) {
                System.out.print(p + " ");
            }
            System.out.println();



        }

        System.out.println("*".repeat(100));


        System.out.println("Contador de MISS: " + contMiss);

        System.out.println("Contador de HIT" + contHit);

        System.out.println("*".repeat(100));


    }

    public static void LRU( ArrayList<String> lista){

        System.out.println("-".repeat(100));

        System.out.println(lista);

        System.out.println(".".repeat(100));

        int tamanhoCache = 4;

        ArrayList<String> cache = new ArrayList(4);

        int contMiss = 0;
        int contHit = 0;

        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        for (String dado : lista) {

            System.out.printf("\n\nESSE É O DADO: <%s> \n",  dado);

            if (cache.size() == 0){





            }

            if (cache.contains(dado)) {

                contMiss++;

                System.out.println("O dado: " + dado + " já está na cache. [MISS:" + contMiss +"]");

                int indice = cache.indexOf(dado);

                System.out.printf("O dado < %s > está no indice %s \n",dado, indice);


                switch (indice) {
                    case 0:

                        cont0++;

                        break;
                    case 1:

                        cont1++;

                        break;
                    case 2:

                        cont2++;

                        break;
                    case 3:

                        cont3++;

                        break;
                }

                // contador para cada espaço do array
                continue;
            }

            if (cache.size() >= tamanhoCache) {

                System.out.println("CACHE ESTA CHEIO!!!");

                int menor = Math.min(Math.min(cont0, cont1), Math.min(cont2, cont3));

                String limpar = cache.remove(menor);

                System.out.println(cache);

                System.out.println("O Dado " + limpar + " foi removida da cache.");

            }

            contHit++;
            System.out.printf("Dado %s adicionado ao CACHE [HIT: %s]\n", dado, contHit );
            cache.add(dado);


            System.out.println("Conteúdo atual da cache:");
            for (String p : cache) {
                System.out.print(p + " ");
            }
            System.out.println();

        }



    }

    public static void LFU( ArrayList<String> lista){

        System.out.println(lista);

    }
}
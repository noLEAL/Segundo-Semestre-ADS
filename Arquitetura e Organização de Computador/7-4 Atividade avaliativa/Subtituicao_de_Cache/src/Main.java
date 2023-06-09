
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.String.*;

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
            System.out.println("(3) LFU");

            System.out.println("(0) Encerrar atividades");

            System.out.println("=".repeat(100));

            int escolha = key.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("(1) FIFO");

                    System.out.println("Qual das entradas que você deseja usar:");

                    System.out.print("(1)");
                    System.out.println(entradaStringA);

                    System.out.print("(2)");
                    System.out.println(entradaStringB);

                    System.out.print("(3)");
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

                    System.out.print("(1)");
                    System.out.println(entradaStringA);

                    System.out.print("(2)");
                    System.out.println(entradaStringB);

                    System.out.print("(3)");
                    System.out.println(entradaStringC);

                    int entrada1 = key.nextInt();

                    if (entrada1 == 1){

                        LRU(entradaStringA);

                    }

                    if (entrada1 == 2) {

                        LRU(entradaStringB);

                    }

                    if (entrada1 ==3){

                        LRU(entradaStringC);

                    }

                    if (entrada1 != 1 && entrada1 != 2 && entrada1 != 3){

                        System.out.println("Você é burro ");

                    }

                    break;
                case 3:
                    System.out.println("(3) LFU");

                    System.out.println("Qual das entradas que você deseja usar:");

                    System.out.print("(1)");
                    System.out.println(entradaStringA);

                    System.out.print("(2)");
                    System.out.println(entradaStringB);

                    System.out.print("(3)");
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

        ArrayList<String> cache = new ArrayList<>(4);

        int contMiss = 0;
        int contHit = 0;

        for (String dado : lista) {

            System.out.printf("\n\nESSE É O DADO: <%s> \n",  dado);

            if (cache.contains(dado)) {
                contHit++;
                System.out.println("O dado: " + dado + " já está na cache. [HIT:" + contHit +"]");
                continue;
            }

            if (cache.size() >= tamanhoCache) {

                System.out.println("CACHE ESTA CHEIO!!!");
                System.out.println(cache);
                cache.remove(0);
                System.out.println("");

            }

            cache.add(dado);
            contMiss ++;
            System.out.println("O Dado " + dado + " foi adicionada à cache. [MISS: " + contMiss + "]");

            System.out.println("Conteúdo atual da cache:");
            System.out.println(cache);
            System.out.println();

        }

        System.out.println("*".repeat(100));
        System.out.println("Entradas: "+ (contHit+contMiss));
        System.out.println("Contador de MISS: " + contMiss);
        System.out.println("Contador de HIT: " + contHit);
        final var resultado = format("%.2f", ((double) contHit / (contHit + contMiss)) * 100) + "%";
        System.out.println("Eficiência: "+resultado);
        System.out.println("*".repeat(100));

    }

    /*==========================================================================================================*/

    public static void LRU( ArrayList<String> lista){

        System.out.println("-".repeat(100));
        System.out.println(lista);
        System.out.println(".".repeat(100));

        int tamanhoCache = 4;
        ArrayList<String> cache = new ArrayList<>();
        Map<String, Integer> cacheMap = new HashMap<>();

        int contMiss = 0;
        int contHit = 0;

        for (String dado : lista) {

            System.out.printf("\n\nESSE É O DADO: <%s> \n", dado);

            if (cacheMap.containsKey(dado)) {

                contHit++;
                System.out.println("O dado: " + dado + " já está na cache. [HIT:" + contHit + "]");
                cache.remove(dado);
                cache.add(dado);

            } else {
                if (cache.size() >= tamanhoCache) {
                    System.out.println("CACHE CHEIO!!!");
                    String removido = cache.remove(0);  // REMOVENDO O INDICE 0 MAIS ANTIGO
                    cacheMap.remove(removido);
                }


                cache.add(dado);
                cacheMap.put(dado, cache.size() - 1);
                contMiss++;
                System.out.println("O Dado " + dado + " foi adicionado à cache. [MISS:" + contMiss + "]");

            }

            System.out.println("Conteúdo atual da cache:");
            System.out.println(cache);

        }

        System.out.println("*".repeat(100));
        System.out.println("Entradas: "+ (contHit+contMiss));
        System.out.println("Contador de MISS: " + contMiss);
        System.out.println("Contador de HIT: " + contHit);
        final var resultado = format("%.2f", ((double) contHit / (contHit + contMiss)) * 100) + "%";
        System.out.println("Eficiência: "+resultado);
        System.out.println("*".repeat(100));

    }

    /*==========================================================================================================*/

    public static void       LFU( ArrayList<String> lista){

        System.out.println("-".repeat(100));
        System.out.println(lista);
        System.out.println(".".repeat(100));

        int tamanhoCache = 4;
        ArrayList<String> cache = new ArrayList<>();
        Map<String, Integer> cacheMap = new HashMap<>();

        int contMiss = 0;
        int contHit = 0;

        for (String dado : lista) {
            System.out.printf("\n\nESSE É O DADO: <%s> \n", dado);

            if (cacheMap.containsKey(dado)) {
                int atual = cacheMap.get(dado);
                System.out.printf("O dado: [%s] já está na cache. Frequencia atual [%s]\n", dado, atual );
                contHit++;
                System.out.println("[HIT++] " + contHit);
                System.out.println("cachemap" + cacheMap);


                atual = cacheMap.get(dado);
                //System.out.println("atual" + atual);

                int atualizado = atual + 1;
                //System.out.println("atualiado" + atualizado);

                cacheMap.replace(dado, atualizado);

                System.out.println("Conteúdo ATUALIZADO:");
                System.out.println( cacheMap);

            } else {
                if (cache.size() >= tamanhoCache) {

                    System.out.println("CACHE CHEIO!!!");
                    System.out.println("cachemap" + cacheMap);

                    int menor = 0;
                    String chaveMenor = null;

                    for (Map.Entry<String, Integer> entrada : cacheMap.entrySet()) {

                        Integer valor = entrada.getValue();

                        if (menor == 0 || valor <= menor){

                            menor = valor;
                            chaveMenor = entrada.getKey();

                        }

                    }

                    if (chaveMenor != null) {
                        cacheMap.remove(chaveMenor);
                        cache.remove(chaveMenor);
                        System.out.println("Entrada removida: Chave " + chaveMenor);
                    }

                }

                cache.add(dado);
                int frequencia = 1;
                cacheMap.put(dado, frequencia);
                contMiss++;
                System.out.println("[MISS++] " + contMiss);
                System.out.println("O Dado " + dado + " foi adicionado à cache. Frequencia atual:" + frequencia);
                System.out.println("cache atual" + cacheMap);
            }
        }

        System.out.println("*".repeat(100));
        System.out.println("Entradas:"+ (contHit+contMiss));
        System.out.println("Contador de MISS: " + contMiss);
        System.out.println("Contador de HIT: " + contHit);
        final var resultado = format("%.2f", ((double) contHit / (contHit + contMiss)) * 100) + "%";
        System.out.println("Eficiência: "+resultado);
        System.out.println("*".repeat(100));

    }
}
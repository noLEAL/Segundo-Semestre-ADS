

public class test {
/*
===================================================================================
                    LFU Abstrato


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

            if (cache.contains(dado)) {

                contMiss++;

                System.out.println("O dado: " + dado + " já está na cache. [MISS:" + contMiss +"]");

                int indice = cache.indexOf(dado);

                System.out.printf("O dado < %s > está no indice %s \n",dado, indice);


                switch (indice) {
                    case 0:

                        cont0++;
                        System.out.println("cont0++" + cont0);

                        break;
                    case 1:

                        cont1++;
                        System.out.println("cont1++" + cont1);

                        break;
                    case 2:

                        cont2++;
                        System.out.println("cont2++" + cont2);

                        break;
                    case 3:

                        cont3++;
                        System.out.println("cont3++" + cont3);

                        break;
                }

                // contador para cada espaço do array
                continue;
            }

            if (cache.size() >= tamanhoCache) {

                System.out.println("CACHE ESTA CHEIO!!!");

                int menor = Math.min(Math.min(cont0, cont1), Math.min(cont2, cont3));

                if (menor == cont0){

                    cont0 = 0;
                    System.out.println("cont0 --" + cont0);

                } else if (menor == cont1) {

                    cont1 = 0;
                    System.out.println("cont1 --" + cont1);

                } else if (menor ==  cont2) {

                    cont2 = 0;
                    System.out.println("cont2 --" + cont2);

                }else if (menor == cont3){

                    cont3 = 0;
                    System.out.println("cont2 --" + cont3);

                }

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
            System.out.printf("\n%s %s %s %s",cont0, cont1, cont2, cont3);
            System.out.println();

        }



    }


====================================================================================


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

        FIFO(entradaStringA);

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
*/
}

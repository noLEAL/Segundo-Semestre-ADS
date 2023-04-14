import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Math.addExact;

public class Main {
    public static int cont = 0;
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int escolha, test, preTest;

        test = 5;

        System.out.println("=".repeat(100));
        System.out.println("Escolha uma da opções:");
        System.out.println("[0] Para testar ou [1] para avaliar ");

        preTest = key.nextInt();
        System.out.println("=".repeat(100));
        if(preTest == 0){

            System.out.println("Modo Teste Vetor definido para 10 possições");
            test = 10;

        }else {

            System.out.println("Modo avaliação vetor definido para 10.000 possições");
            test = 10000;

        }



        int vetorMain[] = new int[test];

        while(true) {

            System.out.println("=".repeat(100));

            System.out.println("Escolha uma da opções:");
            System.out.println("(1)Criar o vetor vazio ou \"zerar o vetor\""); //OK
            System.out.println("(2)inserir um valor no vetor - utilizando uma estratégia para que o próximo elemento vazio receba este novo valor"); //OK
            System.out.println("(3)apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser \"zerado\""); //OK
            System.out.println("(4)consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor"); //OK
            System.out.println("(5)consultar quantos valores significativos já ocupam o vetor"); //OK
            System.out.println("(6)consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor"); //OK
            System.out.println("(7)consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor"); //OK
            System.out.println("(8)apresentar uma listagem dos valores armazenados no vetor");//OK
            System.out.println("(9)inserir conteúdo no vetor a partir da geração de valores aleatórios já ordenados"); //OK
            System.out.println("(10)mais uma funcionalidade de consulta, que utilize busca binária implementada com recursividade."); //OK
            System.out.println("(11)inserir conteúdo no vetor a partir da geração de valores aleatórios NÃO ORDENADOS"); //OK
            System.out.println("(12)verificação para permitir usar as buscas somente se o vetor já tiver sido ordenado"); //OK
            System.out.println("(13)"); //OK

            System.out.println("(0)sair do programa"); //OK

            System.out.println("=".repeat(100));

            escolha = key.nextInt();


            if (escolha == 1) {

                System.out.println("Opção escolhida 1");
                Operacao1(vetorMain);

            }else if(escolha == 2){

                System.out.println("Opção escolhida 2");
                Operacao2(vetorMain);

            }else if(escolha == 3) {

                Operacao3(vetorMain);

            }else if(escolha == 4) {

                Operacao4(vetorMain);

            }else if(escolha == 5) {

                Operacao5(vetorMain);

            }else if(escolha == 6) {

                Operacao6(vetorMain);

            }else if(escolha == 7) {

                Operacao7(vetorMain);

            }else if(escolha == 8) {

                Operacao8(vetorMain);

            }else if(escolha == 9){

                Operacao9(vetorMain);

            }else if (escolha == 10){

                int chave,resultado,resultado2;



                System.out.print("Digite o numero que deseja buscar:");
                chave = key.nextInt();

                resultado2 = Operacao10_1(vetorMain,chave);

                if (resultado2 == -1) {
                    int gambiarra = 0;
                    gambiarra = vetorMain.length-1;
                    System.out.println("Elemento não encontrado:");
                    System.out.println("Número de chamadas sequencial:" + gambiarra);
                } else {
                    System.out.println("Numero encontrado no indice:" + resultado2);
                    System.out.println("Número de chamadas sequencial: " + resultado2);
                }

                resultado = Operacao10(vetorMain,chave,0,vetorMain.length-1);

                if (resultado == -1) {
                    System.out.println("Elemento não encontrado:");
                    System.out.println("Número de chamadas recursiva: " + cont);
                } else {
                    System.out.println("Elemento encontrado no índice: " + resultado);
                    System.out.println("Número de chamadas recursiva: " + cont);
                }


            }else if(escolha == 11){

                Operacao11(vetorMain);

            }else if(escolha == 12){

                Operacao12(vetorMain);

            }else if (escolha == 13){

                Operacao13(vetorMain);

            }else if(escolha == 14){

                Operacao14(vetorMain);

            }else if(escolha == 15){

                Operacao15(vetorMain);

            }else if(escolha == 16){

                int esquerda = vetorMain[0];
                int direita = vetorMain.length-1;

                Operacao16(vetorMain, esquerda, direita );

            }else if (escolha == 0) {

                System.out.print("Sistema Finalizado! Bye Bye");
                System.exit(0);

            }else {

                System.out.println("Usuário burro não escolheu nenhuma das opções acima.");

            }

        }

    }



    public static int[] Operacao1(int vetor[]) {
        // criar o vetor vazio ou "zerar o vetor"

        for(int i = 0; i < vetor.length; i++) {

            vetor[i] = 0;

        }

        return vetor;
    }

    public static int[] Operacao2(int vetor2[]) {
        //inserir um valor no vetor - utilizando uma estratégia para que o próximo elemento vazio receba este novo valor

        Scanner key = new Scanner(System.in);

        int escolha;

        System.out.println("Qual número deseja adicionar?");
        escolha = key.nextInt();

        for(int i =0; i < vetor2.length; i++) {

            if(vetor2[i] == 0 ) {

                vetor2[i] = escolha;
                i++;
                break;

            }

        }

        return vetor2;
    }

    public static int[] Operacao3(int vetor3[]) {
        //apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser "zerado"

        Scanner key = new Scanner(System.in);

        int escolha;

        System.out.println("Digite o valor a ser substituido:");
        escolha = key.nextInt();

        for(int i = 0; i < vetor3.length; i++) {

            if(escolha == vetor3[i]) {

                vetor3[i] = 0;
                break;

            }

        }

        return vetor3;
    }

    public static void Operacao4(int vetor4[]) {
        //consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor

        Scanner key = new Scanner(System.in);

        int escolha,flag;

        flag = 0;

        System.out.println("Digite o valor que deseja consultar:");
        escolha = key.nextInt();

        for(int i = 0; i < vetor4.length; i++) {

            if(escolha == vetor4[i]) {

                System.out.println("Valor encontrado no elemento: " + i);
                flag++;
                break;

            }

        }
        if(flag == 0 ){

            System.out.println("Valor não encontrado");

        }

    }

    public static void Operacao5(int vetor5[]) {
        //consultar quantos valores significativos já ocupam o vetor

        int flag = 0;

        for(int i = 0; i < vetor5.length; i++) {

            if(vetor5[i] != 0 ) {

                flag++;

            }

        }

        System.out.println("Existem " + flag + " valores significativos." );

    }

    public static void Operacao6(int vetor6[]) {
        //consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor

        int maior,flag;

        maior = vetor6[0];
        flag = 0;
        for (int i = 0; i < vetor6.length; i++) {
            if (vetor6[i] > maior) {
                maior = vetor6[i];
                flag = i;
            }
        }
        System.out.printf("Maior número é %d, no índice %d%n", maior, flag);

    }

    public static void Operacao7(int vetor7[]) {

        int menor,flag;
        flag = 0;
        menor = vetor7[0];

        for (int i = 0; i < vetor7.length; i++) {
            if (vetor7[i] < menor) {
                menor = vetor7[i];
                flag = i;
            }
        }
        System.out.printf("menor número é %d, no índice %d%n8", menor, flag);

    }

    public static void Operacao8(int vetor8[]) {

        for(int i = 0; i < vetor8.length; i++) {

            System.out.println("O valor na possição " + i + " é de " + vetor8[i]);

        }

    }

    public static int[] Operacao9(int vetor9[]) {

        int numR, aux;
        Random random = new Random();

        aux = 0;

        for(int i = 0; i < vetor9.length; i++){

            numR = random.nextInt(100);


            if (numR != 0){

                aux += numR;

            }

            vetor9[i] = aux+1;

        }

        return vetor9;
    }

    public static int  Operacao10(int vetor10[], int chave, int esquerda,int direita) {

        cont++;

        if (esquerda > direita) {
            return -1;
        }

        int meio = (esquerda + direita) / 2;

        if (vetor10[meio] == chave) {
            return meio;
        } else if (chave < vetor10[meio]) {
            return Operacao10(vetor10, chave, esquerda, meio - 1);
        } else {
            return Operacao10(vetor10, chave, meio + 1, direita);
        }

    }

    public static int  Operacao10_1(int vetor10[], int chave) {

        int indice = 0;

        for (int i = 0; i < vetor10.length-1 ; i++) {

            if (vetor10[i] == chave){

                indice = i;

                return indice;

            }
        }
        return -1;
    }

    public static int[] Operacao11(int vetor11[]) {

        int numR, aux;
        Random random = new Random();

        aux = 0;

        for(int i = 0; i < vetor11.length; i++){

            aux++;
            numR = random.nextInt(100);

            if(numR == 0 ){

                vetor11[i] = addExact(aux,aux-1); //soma inteiro

            }else {

                vetor11[i] = numR;
            }

        }

        return vetor11;
    }

    public static void Operacao12(int vetor12[]){

        int desordenado = 0;

        for (int i = 0; i < vetor12.length-1; i++) {

            if (vetor12 [i] > vetor12[i+1]){

                desordenado++;

            }

        }

        if (desordenado != 0 ){

            System.out.println("Vetor se encontra desordenado");

        }else {

            System.out.println("Vetor se encontra Ordenado");

        }


    }

    public static int[] Operacao13(int vetor13[]){

        boolean troca;
        int count = 0;
        for (int i = 0; i < vetor13.length-1; i++) {
            troca = false;
            for (int j = 0; j < vetor13.length-1 - i - 1; j++) {
                if (vetor13[j] > vetor13[j + 1]) {
                    int aux = vetor13[j];
                    vetor13[j] = vetor13[j + 1];  //momento que inverte com a ajuda da aux
                    vetor13[j + 1] = aux;           //momento que inverte com a ajuda da aux
                    troca = true;
                    count++;
                }
            }
            if (!troca) {
                break;
            }
        }

        System.out.println("Número de trocas: " + count);

        return vetor13;
    }

    public static int[] Operacao14(int vetor14[]){
        int count = 0;
        for (int i = 0; i < vetor14.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetor14.length; j++) {
                if (vetor14[j] < vetor14[min]) {
                    min = j;
                }
            }
            int aux = vetor14[min];
            vetor14[min] = vetor14[i];
            vetor14[i] = aux;
        }
        System.out.println("Número de trocas: " + count);
        return vetor14;
    }

    public static int[] Operacao15(int vetor15[]){
        int count = 0;
        for (int i = 1; i < vetor15.length; i++) {
            int aux = vetor15[i];
            int j = i - 1;
            while (j >= 0 && vetor15[j] > aux) {
                vetor15[j + 1] = vetor15[j];
                j--;
            }
            vetor15[j + 1] = aux;
        }

        System.out.println("Número de trocas: " + count);
        return vetor15;
    }

    public static int[] Operacao16(int vetor16[], int esquerda , int direita ){

        int i = esquerda;
        int j = direita;
        int meio = vetor16[(esquerda + direita) / 2];
        int temp;
        int count = 0;

        while (i <= j) {
            while (vetor16[i] < meio) {
                i++;
            }
            while (vetor16[j] > meio) {
                j--;
            }
            if (i <= j) {
                temp = vetor16[i];
                vetor16[i] = vetor16[j];
                vetor16[j] = temp;
                count++;
                i++;
                j--;
            }
        }
        if (esquerda < j) {
            Operacao16(vetor16, esquerda, j);
        }
        if (i < direita) {
            Operacao16(vetor16, i, direita);
        }

        return vetor16;

    }


}

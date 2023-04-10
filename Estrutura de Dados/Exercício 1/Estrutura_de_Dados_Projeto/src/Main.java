import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int escolha, test, preTest;

        test = 5;

        System.out.println("Escolha uma da opções:");
        System.out.println("[0] Para testar ou [1] para avaliar ");

        preTest = key.nextInt();

        if(preTest == 0){

            System.out.println("Modo Teste Vetor definido para 5 possições");
            test = 5;

        }else {

            System.out.println("Modo avaliação vetor definido para 10.000 possições");
            test = 10000;

        }



        int vetorMain[] = new int[test];

        while(true) {

            System.out.println("=====================================================================================================");

            System.out.println("Escolha uma da opções:");
            System.out.println("(1)Criar o vetor vazio ou \"zerar o vetor\""); //OK
            System.out.println("(2)inserir um valor no vetor - utilizando uma estratégia para que o próximo elemento vazio receba este novo valor"); //OK
            System.out.println("(3)apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser \"zerado\""); //OK
            System.out.println("(4)consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor"); //OK
            System.out.println("(5)consultar quantos valores significativos já ocupam o vetor"); //OK
            System.out.println("(6)consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor"); //OK
            System.out.println("(7)consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor"); //OK
            System.out.println("(8)apresentar uma listagem dos valores armazenados no vetor");//OK
            System.out.println("(9)inserir conteúdo no vetor a partir da geração de valores aleatórios já ordenados");
            System.out.println("(10)mais uma funcionalidade de consulta, que utilize busca binária implementada com recursividade.");
            System.out.println("(0)sair do programa"); //OK

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

                System.out.print("Sistema Finalizado! Bye Bye");

                Operacao10(vetorMain);

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

        int flag;
        flag = 0;

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

    public static int [] Operacao9(int vetor9[]) {

        int numR, aux;
        Random random = new Random();

        aux = 0;

        for(int i = 0; i < vetor9.length; i++){

            numR = random.nextInt(100);

            if (numR != 0){

                aux += numR;

            }

            vetor9[i] = aux;

        }

        return vetor9;
    }

    private static int busca(int[] vetorbusca, int chave) {
        return Operacao10(array, 0, array.length - 1, chave);
    }

    public static int [] Operacao10(int vetor10[]) {



        int maior, menor,meio;

        menor = vetor10[0];
        maior = vetor10[vetor10.length-1];
        meio = menor+maior

        System.out.println(menor);
        System.out.println(maior);

        int media = (maior + menor) / 2;
        int valorMeio = vetor10[media];

        if (menor > maior)
            return -1;
        else if (valorMeio == meio)
            return media;
        else if (valorMeio < chave)
            return Operacao10(vetor10, meio + 1, maior, chave);
        else
            return Operacao10(vetor10, menor, meio - 1, chave);


        }
        return vetor10;
    }


}

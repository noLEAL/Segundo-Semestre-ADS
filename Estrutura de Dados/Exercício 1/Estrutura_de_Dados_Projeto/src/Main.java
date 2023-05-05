import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Math.addExact;

public class Main {
    public static int cont = 0;
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int escolha;
        classeVetor vetor;

        System.out.println("=".repeat(100));

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
            System.out.println("(13)Método de Orientação BubbleSort"); //OK
            System.out.println("(14)Método de Orientação SelectionSort"); //OK
            System.out.println("(15)Método de Orientação InsertionSort"); //OK
            System.out.println("(16)Método de Orientação QuickSort"); //OK
            System.out.println("(0)sair do programa"); //OK

            System.out.println("=".repeat(100));

            escolha = key.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Opção escolhida 1");
                    vetor.classeVetor;
                    break;
                case 2:
                    System.out.println("Opção escolhida 2");
                    Operacao2(vetorMain);
                    break;
                case 3:
                    Operacao3(vetorMain);
                    break;
                case 4:
                    Consulta consultaVet = new Consulta(vetorMain);
                    break;
                case 5:
                    Operacao5(vetorMain);
                    break;
                case 6:
                    Operacao6(vetorMain);
                    break;
                case 7:
                    Operacao7(vetorMain);
                    break;
                case 8:
                    Operacao8(vetorMain);
                    break;
                case 9:
                    Operacao9(vetorMain);
                    break;
                case 10:

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
                    break;
                case 11:
                    Operacao11(vetorMain);
                    break;
                case 12:
                    Operacao12(vetorMain);
                    break;
                case 13:
                    Operacao13(vetorMain);
                    break;
                case 14:
                    Operacao14(vetorMain);
                    break;
                case 15:
                    Operacao15(vetorMain);
                    break;
                case 16:
                    int esquerda = vetorMain[0];
                    int direita = vetorMain.length-1;

                    Operacao16(vetorMain, esquerda, direita );
                    break;
                case 0:
                    System.out.print("Sistema Finalizado! Bye Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Usuário burro não escolheu nenhuma das opções acima.");
                    break;
            }
        }

        public static void Operacao8(int vetor8[]) {

            for(int i = 0; i < vetor8.length; i++) {

                System.out.println("O valor na possição " + i + " é de " + vetor8[i]);

            }

        }




    }
}

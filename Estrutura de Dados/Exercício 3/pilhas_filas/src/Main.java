import Fila.Fila;
import Lista.Lista;
import Pilha.Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        import java.util.Scanner;

        public class ClassePrincipal {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Pilha pilha = new Pilha();
                Fila fila = new Fila();
                Lista lista = new Lista();

                int opcao = 0;
                do {
                    System.out.println("Escolha uma opção:");
                    System.out.println("1. Inserir na pilha");
                    System.out.println("2. Remover da pilha");
                    System.out.println("3. Inserir na fila");
                    System.out.println("4. Remover da fila");
                    System.out.println("5. Inserir na lista");
                    System.out.println("6. Remover da lista");
                    System.out.println("0. Sair");

                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor a ser inserido na pilha:");
                            int valorPilha = scanner.nextInt();
                            pilha.inserir(valorPilha);
                            break;
                        case 2:
                            int valorRemovidoPilha = pilha.remover();
                            if (valorRemovidoPilha != -1) {
                                System.out.println("Valor removido da pilha: " + valorRemovidoPilha);
                            } else {
                                System.out.println("A pilha está vazia.");
                            }
                            break;
                        case 3:
                            System.out.println("Digite o valor a ser inserido na fila:");
                            int valorFila = scanner.nextInt();
                            fila.inserir(valorFila);
                            break;
                        case 4:
                            int valorRemovidoFila = fila.remover();
                            if (valorRemovidoFila != -1) {
                                System.out.println("Valor removido da fila: " + valorRemovidoFila);
                            } else {
                                System.out.println("A fila está vazia.");
                            }
                            break;
                        case 5:
                            System.out.println("Digite o valor a ser inserido na lista:");
                            int valorLista = scanner.nextInt();
                            lista.inserirFim(valorLista);
                            break;
                        case 6:
                            int valorRemovidoLista = lista.removerInicio();
                            if (valorRemovidoLista != -1) {
                                System.out.println("Valor removido da lista: " + valorRemovidoLista);
                            } else {
                                System.out.println("A lista está vazia.");
                            }
                            break;
                        case 0:
                            System.out.println("Encerrando o programa...");
                            break;
                        default:
                            System.out.println("Opção inválida. Digite um número válido.");
                            break;
                    }

                    System.out.println("-----------------------------------");

                } while (opcao != 0);

                scanner.close();
            }
        }


    }
}
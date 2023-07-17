import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        Scanner key = new Scanner(System.in);

        ///////////////////////////////////////APENAS PARA TESTE//////////////////////////////////////////////
        grafo.cadastrarCidade("Pelotas");
        grafo.cadastrarCidade("Santa Maria");
        grafo.cadastrarCidade("Curitiba");
        grafo.cadastrarCidade("Porto Alegre");
        ///////////////////////////////////////APENAS PARA TESTE//////////////////////////////////////////////

        while (true) {

            System.out.println("=".repeat(100));

            System.out.println("(1) - Cadastrar uma cidade");
            System.out.println("(2) - Cadastra conexão");
            System.out.println("(3) - Listar cidades");
            System.out.println("(4) - Listar conexões");
            System.out.println("(5) - Listar cidades vizinhas");
            System.out.println("(0) - Finalizar");

            System.out.println("=".repeat(100));

            int option = key.nextInt();

            switch (option) {

                case 1 -> {

                    System.out.println("Digite o nome da cidade: ");
                    String nome = key.nextLine();
                    grafo.cadastrarCidade(nome);

                }
                case 2 -> {

                    System.out.println("Cadastrar conexão: ");

                    grafo.listarCidades();

                    System.out.println("Digite o origem da conexão: ");
                    int origem = key.nextInt();
                    System.out.println("Digite o destino da conexão: ");
                    int destino = key.nextInt();
                    System.out.println("Digite a distancia da conexão: ");
                    int distancia = key.nextInt();
                    grafo.cadastrarConexao(grafo.vertices.get(origem), grafo.vertices.get(destino), distancia);

                }
                case 3 -> {

                    System.out.println("Cidades cadastradas:");
                    grafo.listarCidades();

                }
                case 4 -> {

                    System.out.println("Conexoes cadastradas:");
                    grafo.listarConexoes();

                }
                case 5 -> {

                    System.out.println("Cidades vizinhas de [ ? ]:");
                    grafo.listarCidades();
                    System.out.println("Digite numero da cidade: ");
                    int vizinhas = key.nextInt();
                    grafo.listarCidadesVizinhas(grafo.vertices.get(vizinhas));

                }
                case 0 -> System.exit(1);
                default -> System.out.println("Tente novamente");
            }
        }
    }
}
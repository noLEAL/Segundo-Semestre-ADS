public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.cadastrarCidade("São Paulo");
        grafo.cadastrarCidade("Rio de Janeiro");
        grafo.cadastrarCidade("Curitiba");
        grafo.cadastrarCidade("Porto Alegre");

        grafo.cadastrarConexao(grafo.vertices.get(0), grafo.vertices.get(1), 400);
        grafo.cadastrarConexao(grafo.vertices.get(0), grafo.vertices.get(2), 300);
        grafo.cadastrarConexao(grafo.vertices.get(1), grafo.vertices.get(3), 600);
        grafo.cadastrarConexao(grafo.vertices.get(2), grafo.vertices.get(3), 700);

        System.out.println("Cidades cadastradas:");
        grafo.listarCidades();

        System.out.println("\nConexões cadastradas:");
        grafo.listarConexoes();

        System.out.println("\nCidades vizinhas de São Paulo:");
        grafo.listarCidadesVizinhas(grafo.vertices.get(0));
    }
}
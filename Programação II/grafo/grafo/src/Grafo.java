import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Grafo {
    public List<Vertice> vertices;
    private List<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void cadastrarCidade(String nome) {
        Vertice cidade = new Vertice(nome);
        this.vertices.add(cidade);
    }

    public void cadastrarConexao(Vertice origem, Vertice destino, int distancia) {
        Aresta conexao = new Aresta(origem, destino, distancia);
        this.arestas.add(conexao);
    }

    public void listarCidades() {
        for (Vertice cidade : this.vertices) {
            System.out.println(cidade.getNome());
        }
    }

    public void listarConexoes() {
        for (Aresta conexao : this.arestas) {
            System.out.println("Origem: " + conexao.getOrigem().getNome() +
                    " | Destino: " + conexao.getDestino().getNome() +
                    " | Distância: " + conexao.getDistancia());
        }
    }

    public void listarCidadesVizinhas(Vertice cidadeOrigem) {
        List<Aresta> vizinhos = new ArrayList<>();
        for (Aresta conexao : this.arestas) {
            if (conexao.getOrigem() == cidadeOrigem || conexao.getDestino() == cidadeOrigem) {
                vizinhos.add(conexao);
            }
        }

        vizinhos.sort(new Comparator<Aresta>() {
            public int compare(Aresta a1, Aresta a2) {
                return Integer.compare(a1.getDistancia(), a2.getDistancia());
            }
        });

        for (Aresta vizinho : vizinhos) {
            Vertice cidadeDestino = (vizinho.getOrigem() == cidadeOrigem) ? vizinho.getDestino() : vizinho.getOrigem();
            System.out.println("Cidade: " + cidadeDestino.getNome() + " | Distância: " + vizinho.getDistancia());
        }
    }

}
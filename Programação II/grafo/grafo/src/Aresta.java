class Aresta {
    public Vertice origem;
    public Vertice destino;
    public int distancia;

    public Aresta(Vertice origem, Vertice destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Vertice getOrigem() {
        return this.origem;
    }

    public Vertice getDestino() {
        return this.destino;
    }

    public int getDistancia() {
        return this.distancia;
    }
}

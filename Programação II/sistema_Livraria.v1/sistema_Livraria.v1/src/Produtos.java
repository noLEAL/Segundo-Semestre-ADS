public class Produtos {

    private String titulo,editora,area;
    private int codigo,ano,quantidade_em_Estoque;
    private double valor;
    Produtos(){

        this.titulo = titulo;
        this.editora = editora;
        this.area = area;
        this.codigo = codigo;
        this.ano = ano;
        this.quantidade_em_Estoque = quantidade_em_Estoque ;
        this.valor = valor;

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade_em_Estoque() {
        return quantidade_em_Estoque;
    }

    public void setQuantidade_em_Estoque(int quantidade_em_Estoque) {
        this.quantidade_em_Estoque = quantidade_em_Estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

    public void info(){

        System.out.println(">>>>> Cod#" + this.codigo);
        System.out.println("Titulo/Editora:" + this.titulo + "/" + this.editora);
        System.out.println("Categoria:" + this.area);
        System.out.println("Ano:" + this.ano);
        System.out.println("Valor:" + this.valor);
        System.out.println("Estoque:" + this.quantidade_em_Estoque + "unidades");
        System.out.printf("Valor total em estoque: R$ %s%n", this.valor * Double.valueOf(this.quantidade_em_Estoque));

    }
}

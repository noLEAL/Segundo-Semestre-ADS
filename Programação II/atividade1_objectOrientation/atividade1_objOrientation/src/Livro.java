public class Livro {

    String titulo, ISBN, autores, editora;
    int estoque, valor;

    Livro(String titulo, String ISBN, String autores, String editora, int estoque, int valor ){

        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autores = autores;
        this.editora = editora;
        this.estoque = estoque;
        this.valor = valor;

    }

    public void info(){

        System.out.printf("====================================================================================%n");
        System.out.printf("Titulo do Livro:" + this.titulo + "%n");
        System.out.printf("ISBN:" + this.ISBN + "%n");
        System.out.printf("Autores:" + this.autores + "%n");
        System.out.printf("Editora:" + this.editora + "%n");
        System.out.printf("Estoque:" + this.estoque + "%n");
        System.out.printf("Valor:" + this.valor + " reais" + "%n");

    }


}

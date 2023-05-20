import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio do Programa");

        Scanner key = new Scanner(System.in);

        int escolha;

        ArrayList<Produtos> array_livro = new ArrayList<>();

        while(true) {

            System.out.println("=".repeat(100));

            System.out.println("(1) Cadastrar novo livro");
            System.out.println("(2) Listar livros");
            System.out.println("(3) Buscar livros por nome");
            System.out.println("(4) Buscar livros por categoria");
            System.out.println("(5) Buscar livros por preço");
            System.out.println("(6) Busca por quantidade em estoque");
            System.out.println("(7) Valor total no estoque");
            System.out.println("(0) Encerrar atividades");

            System.out.println("=".repeat(100));

            escolha = key.nextInt();

            switch (escolha) {
                case 1:

                    System.out.println("-".repeat(100));
                    System.out.println("Cadastro de Livro:");

                    Produtos produto = new Produtos();

                    String buffer = key.nextLine();

                    System.out.println("Titulo");
                    String titulo = key.nextLine();
                    produto.setTitulo(titulo);

                    System.out.println("Editora");
                    String editora = key.nextLine();
                    produto.setEditora(editora);

                    System.out.println("Categoria");
                    String area = key.nextLine();
                    produto.setArea(area);

                    System.out.println("Codigo");
                    int codigo = key.nextInt();
                    produto.setCodigo(codigo);

                    System.out.println("Ano");
                    int ano = key.nextInt();
                    produto.setAno(ano);

                    System.out.println("Quantidade em Estoque");
                    int quantidade_em_Estoque = key.nextInt();
                    produto.setQuantidade_em_Estoque(quantidade_em_Estoque);

                    System.out.println("Valor");
                    double valor = key.nextDouble();
                    produto.setValor(valor);

                    array_livro.add(produto);


                    break;
                case 2:

                    for (Produtos livro : array_livro ) {

                        livro.info();

                    }

                    break;
                case 3:



                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:

                    System.exit(1);

                    break;
                default:

                    break;
            }
        }
    }
}
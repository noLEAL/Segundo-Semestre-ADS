import java.text.Collator;  //https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/text/Collator.html
import java.util.ArrayList;
import java.util.Locale;  //https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Locale.html
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio do Programa");

        Scanner key = new Scanner(System.in);

        int escolha;

        ArrayList<Produtos> array_livros = new ArrayList<>();

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

                    //(1) Cadastrar novo livro
                    System.out.println("-".repeat(100));

                    System.out.println("Cadastro de Livro:");

                    Produtos produto = new Produtos();

                    String buffer1 = key.nextLine();

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

                    array_livros.add(produto);

                    break;
                case 2:

                    //(2) Listar livros
                    System.out.println("-".repeat(100));

                    for (Produtos produtos : array_livros ) {

                        produtos.info();

                    }

                    break;
                case 3:

                    //(3) Buscar livros por nome");
                    System.out.println("-".repeat(100));
                    String buffer3 = key.nextLine();

                    System.out.println("Buscar livros por nome");

                    System.out.println("Digite o nome do livro que deseja buscar");
                    String busca_NAME = key.nextLine();

                    for (Produtos produtos : array_livros){

                        //System.out.printf("Está comparando [%s] com -> [%s]",busca_category,produtos.getArea() );

                        int comparadorNAME = busca_NAME.compareToIgnoreCase(produtos.getTitulo());

                        if (comparadorNAME >= -2 && comparadorNAME <= -2){

                            System.out.println("Livro encontrado");
                            produtos.info();

                        }

                    }

                    break;
                case 4:

                    //(4) Buscar livros por categoria
                    // https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/String.html

                    System.out.println("-".repeat(100));
                    System.out.println("Buscar livros por categoria");

                    String buffer4 = key.nextLine();

                    System.out.println("Digite a categoria do livro que deseja buscar");
                    String busca_category = key.nextLine();

                    for (Produtos produtos : array_livros){

                        int comparadorCAT = busca_category.compareToIgnoreCase(produtos.getArea());

                        //System.out.printf("Está comparando [%s] com -> [%s] Probabilidade [%s] %n",busca_category, produtos.getArea(), comparadorCAT);

                        if (comparadorCAT >= -2 && comparadorCAT <= -2){

                            System.out.println("Livro encontrado");
                            produtos.info();

                        }

                    }

                    break;
                case 5:

                    //(5) Buscar livros por preço")
                    System.out.println("-".repeat(100));
                    System.out.println("Buscar livros por preço");

                    System.out.println("Digite o Preço do livro que deseja buscar");

                    double busca_pice = key.nextDouble();

                    for (Produtos produtos:array_livros ) {

                        if (busca_pice == produtos.getValor()){

                            produtos.info();

                        }

                    }

                    break;
                case 6:

                    //(6) Busca por quantidade em estoque"
                    System.out.println("-".repeat(100));
                    System.out.println("Buscar livros por quantidade em esoque");

                    System.out.println("Digite a quantidade de livros contidos");

                    int busca_quantity = key.nextInt();

                    for (Produtos produtos:array_livros ) {

                        if (busca_quantity == produtos.getQuantidade_em_Estoque()){

                            produtos.info();

                        }

                    }

                    break;
                case 7:

                    System.out.println("-".repeat(100));
                    double valor_Total = 0;

                    for (Produtos produtos:array_livros ) {

                        valor = produtos.getQuantidade_em_Estoque() * produtos.getValor();

                        valor_Total = valor_Total + valor;
                    }

                    System.out.println("Valor total no estoque:" + valor_Total);

                    break;
                case 0:

                    System.out.println("-".repeat(100));
                    System.out.println("Programa Finalizado");
                    System.exit(1);

                    break;
                default:

                    System.out.println("-".repeat(100));
                    System.out.println("Tente alguma das opções possiveis");

                    break;
            }
        }
    }
}
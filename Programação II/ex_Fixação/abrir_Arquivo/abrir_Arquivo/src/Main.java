import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        FileInputStream arquivo = new FileInputStream("src/arquivo.txt");
        Scanner entradaTexto = new Scanner(arquivo);
        String linha;
        linha = entradaTexto.nextLine();
        System.out.println(linha);

    }
}
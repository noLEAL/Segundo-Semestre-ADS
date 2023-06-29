import java.sql.Connection;
import java.sql.DriverManager;

public class urliNVERTIDA {


    private String nome;
    private String Sigla;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {

        Sigla = sigla;

        Connection conexao = DriverManager.getConnection();
    }
}

import java.util.ArrayList;

public class SistemaCondominio {
    public static void main(String[] args) {
        System.out.println("Teste");
        Morador[] vMorador = new Morador[10];
        Veiculo[] vVeiculo = new Veiculo[10];

        vMorador[0] = new Morador("Iuri", "123", "C", 155);
        vMorador[0].Info();
        vVeiculo[0] = new Veiculo(vMorador[0], "ivc-1234", "fusca 79");
        vVeiculo[0].Info();

        vVeiculo[1] = new Veiculo("IVC-3044", "Gol G5");
        vMorador[1] = new Morador("Ana", "321", "D", 233, vVeiculo[1]);

        vVeiculo[1].Info();



        /*
        Morador p1, p2, p3;
        Colaborador c1;
        Veiculo v1, v2;
        p1 = new Morador("Iuri", "123", "C", 155);
        p3 = new Morador("Jonas", "456", "F", 312);

        p1.Info();

        c1 = new Colaborador("Pedro", "678", "Zelador", "manha-tarde");
        c1.Info();

        v1 = new Veiculo(p1, "ivc-1234", "fusca 79");
        v1.Info();
        v2 = new Veiculo("IVC-3044", "Gol G5");


        p2 = new Morador("Ana", "321", "D", 233, v2);
        System.out.println(p2.veiculo.placa);
        v2.Info();*/

    }
}

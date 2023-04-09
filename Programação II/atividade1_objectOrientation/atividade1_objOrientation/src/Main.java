public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio do Programa");

        Empresa empresa1, empresa2, empresa3;
        Remedio remedio1, remedio2, remedio3;
        Funcionario funcionario1, funcionario2, funcionario3;
        Livro livro1, livro2, livro3;

        empresa1 = new Empresa("Americanis", "32165549834","Rua do Golpe, 157, Poa","Varejo");
        empresa2 = new Empresa("Nestla", "321456987456","Rua arapói, 1210, SP","Produdos alimenticios");
        empresa3 = new Empresa("Guarana gSUS", "3658965412","Rua carapaça, 2657, BA"," Venda de bebidas");

        empresa1.info();
        empresa2.info();
        empresa3.info();

        remedio1 = new Remedio("Azitocina", "marrom", "abbot", "300", "15");
        



        System.out.println("Fim do Programa");

    }
}
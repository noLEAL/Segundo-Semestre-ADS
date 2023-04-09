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

        remedio1 = new Remedio("Azzuracina", "marrom", "abbot", 300, 13);
        remedio2 = new Remedio("Marabácina", "roxa", "bayer", 75, 5);
        remedio3 = new Remedio("Azitocina", "amarela", "ems", 150, 7);

        remedio1.info();
        remedio2.info();
        remedio3.info();

        funcionario1 = new Funcionario("Paulinho", "Cabeça de Pedra", "125632568474", "Magico", "João", 3.213);
        funcionario2 = new Funcionario("Claudio", "Brasil", "56834962725", "Animador de Festa", "Ricardo", 2.324);
        funcionario3 = new Funcionario("Ana", "Maria", "659457823445", "Estagiaria", "Vitoria", 4.213);

        funcionario1.info();
        funcionario2.info();
        funcionario3.info();

        livro1 = new Livro("Hábitos Atômicos", "9783442178582", "James Clear", "LUA DE PAPEL",  50, 340);
        livro2 = new Livro("Sapiens", "9780062316097", "Yuval Harari", "L&PM", 30, 55);
        livro3 = new Livro("Técnicas de Invasão", "9786550440190", "Bruno Fraga", "Editora Labrador", 10, 60);

        livro1.info();
        livro2.info();
        livro3.info();



        System.out.println("Fim do Programa");

    }
}
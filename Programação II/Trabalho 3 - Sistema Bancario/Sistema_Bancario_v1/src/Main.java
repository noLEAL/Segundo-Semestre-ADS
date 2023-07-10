import java.util.Scanner;

//Name developer: Bruno Leal da Silva Paz
//GIT: https://github.com/noLEAL
// version: 1.0

public class Main {
    public static void main(String[] args) {

        //Deve ser criada uma interface para usuário, onde seja possível cadastrar bancos, pessoas e contas, bem como obter informações dos objetos!

        Scanner key = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("bruno");
        pessoa1.setSobrenome("leal");
        pessoa1.setCpf("016509920-84");
        pessoa1.setIdade(23);
        pessoa1.Info();

        pessoa1.setClientes(pessoa1);

        Banco banco1 = new Banco("Banco1","12343234",001);
        banco1.infoBanco();
        banco1.infoContas();
        banco1.criarConta();
        banco1.fecharConta();

        Conta_Poupanca contaPoup = new Conta_Poupanca(pessoa1,banco1,12343,100,"0980",23,3);

        //Conta_Corrente contaCorent = new Conta_Corrente();

        pessoa1.InfoContas();

        /*=====================*/

//        ArrayList<Pessoa> array_clietes = new ArrayList<>();
//
//        ArrayList<Banco> array_bancos = new ArrayList<>();
//
//        ArrayList<Banco> array_correntes = new ArrayList<>();
//
//        ArrayList<Banco> array_pupanca = new ArrayList<>();
//
//        while (true){
//
//
//            System.out.println("=".repeat(100));
//
//            System.out.println("(1) - Cadastrar Clientes");
//            System.out.println("(2) - Cadastrar Bancos");
//            System.out.println("(3) - Criar Conta");
//            System.out.println("(0) - Finalizar");
//
//
//            System.out.println("=".repeat(100));
//
//            int option = key.nextInt();
//
//            switch (option) {
//
//                case 1 -> {
//                    //Cadastrar usuario
//
//                    System.out.println("-".repeat(100));
//
//                    System.out.println("Cadastrar cliente:");
//
//                    Pessoa cliente = new Pessoa();
//                    //ArrayList<Conta_Bancaria> contas = new ArrayList<>();
//
//                    String buffer1 = key.nextLine();
//
//                    System.out.println("Primeiro nome:");
//                    String pri_nome = key.nextLine();
//                    cliente.setNome(pri_nome);
//
//                    System.out.println("Sobrenome:");
//                    String sobrenome = key.nextLine();
//                    cliente.setSobrenome(sobrenome);
//
//                    System.out.println("Idade:");
//                    int idade = key.nextInt();
//                    cliente.setIdade(idade);
//
//                    String buffer11 = key.nextLine();
//
//                    System.out.println("CPF:");
//                    String CPF = key.nextLine();
//                    cliente.setCpf(CPF);
//
//                    cliente.setClientes(cliente);
//
//                    cliente.info();
//
//                }
//                case 2 -> {
//
//                    //Cadastrar banco
//
//                    System.out.println("-".repeat(100));
//
//                    System.out.println("Cadastrar banco:");
//
//                    String buffer2 = key.nextLine();
//
//                    Banco banco = new Banco();
//                    //ArrayList<Conta_Bancaria> contas = new ArrayList<>();
//
//                    System.out.println("Nome do Banco:");
//                    String nome = key.nextLine();
//                    banco.setNome(nome);
//
//                    System.out.println("CNPJ do Banco:");
//                    String cnpj = key.nextLine();
//                    banco.setCNPJ(cnpj);
//
//                    //String buffer22 = key.nextLine();
//
//                    System.out.println("Número do Banco:");
//                    int numero = key.nextInt();
//                    banco.setNroBanco(numero);
//
//                    array_bancos.add(banco);
//
//                    banco.infoBanco();
//
//
//                }
//                case 3 ->{
//
//                    //Criar Conta
//
//                    String buffer3 = key.nextLine();
//
//                    System.out.println("Qual tipo de conta deseja criar: Correte [1] x Poupança [0]");
//
//                    int conta = key.nextInt();
//
//                    if (conta == 1 ){
//
//                        //Conta_Bancaria corrente = new Conta_Corrente();
//
//
//                    }else {
//
//                        //Conta_Bancaria poupanca = new Conta_Poupanca();
//
//
//
//                    }
//
//                }
//                case 0 -> System.exit(1);
//                default -> System.out.println("Tente novamente");
//
//            }
//        }

       /*=====================*/

    }
}

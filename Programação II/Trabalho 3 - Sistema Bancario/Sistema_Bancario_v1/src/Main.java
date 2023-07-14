import java.util.ArrayList;
import java.util.Scanner;

//Name developer: Bruno Leal da Silva Paz
//GIT: https://github.com/noLEAL
// version: 1.0

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> array_clietes = new ArrayList<>();
        ArrayList<Banco> array_bancos = new ArrayList<>();
        ArrayList<Conta_Corrente> array_corrente = new ArrayList<>();
        ArrayList<Conta_Poupanca> array_poupanca = new ArrayList<>();
        Scanner key = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        Banco bancotest1 = new Banco("Brasil","25.496.235/0001-47", 1010);
        array_bancos.add(bancotest1);
        Banco bancotest2 = new Banco("Bradesco","88.298.137/0001-15",1111);
        array_bancos.add(bancotest2);
        Pessoa clientetest1 = new Pessoa("Cliente","Test",23,"016.509.920-84" );
        array_clietes.add(clientetest1);
        Pessoa clientetest2 = new Pessoa("Java","Coffe",79,"837.937.000-11" );
        array_clietes.add(clientetest2);
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        while (true){

            System.out.println("=".repeat(100));

            System.out.println("(1) - Cadastrar Clientes");
            System.out.println("(2) - Cadastrar Bancos");
            System.out.println("(3) - Criar Conta");
            System.out.println("(4) - Informações do Cliente");
            System.out.println("(5) - Informações do Banco");
            System.out.println("(6) - Sacar");
            System.out.println("(7) - Depositar");
            System.out.println("(8) - Simular Mes");
            System.out.println("(0) - Finalizar");

            System.out.println("=".repeat(100));

            int option = key.nextInt();

            switch (option) {

                case 1 -> {
                    //Cadastrar usuario

                    System.out.println("-".repeat(100));

                    System.out.println("Cadastrar cliente:");


                    Pessoa cliente = new Pessoa();

                    String buffer1 = key.nextLine();

                    System.out.println("Primeiro nome:");
                    String pri_nome = key.nextLine();
                    cliente.setNome(pri_nome);

                    System.out.println("Sobrenome:");
                    String sobrenome = key.nextLine();
                    cliente.setSobrenome(sobrenome);

                    System.out.println("Idade:");
                    int idade = key.nextInt();
                    cliente.setIdade(idade);

                    String buffer11 = key.nextLine();

                    System.out.println("CPF:");
                    String CPF = key.nextLine();
                    cliente.setCpf(CPF);

                    array_clietes.add(cliente);

                    cliente.Info();

                }
                case 2 -> {

                    //Cadastrar banco

                    System.out.println("-".repeat(100));

                    System.out.println("Cadastrar banco:");

                    String buffer2 = key.nextLine();

                    Banco banco = new Banco();

                    System.out.println("Nome do Banco:");
                    String nome = key.nextLine();
                    banco.setNome(nome);

                    System.out.println("CNPJ do Banco:");
                    String cnpj = key.nextLine();
                    banco.setCNPJ(cnpj);

                    System.out.println("Número do Banco:");
                    int numero = key.nextInt();
                    banco.setNroBanco(numero);

                    array_bancos.add(banco);

                    banco.infoBanco();

                }
                case 3 ->{

                    //Criar Conta

                    String buffer3 = key.nextLine();

                    System.out.println("Qual tipo de conta deseja criar: Correte [1] x Poupança [0]");

                    int conta = key.nextInt();

                    if (conta == 1 ){

                        Conta_Corrente contaCorrente = new Conta_Corrente();

                        System.out.printf("Selecione Titular:%n");
                        exibirClientes(array_clietes);
                        System.out.printf("%n");
                        int nome = key.nextInt();
                        contaCorrente.setTitular(array_clietes.get(nome));

                        System.out.printf("Selecione Banco:%n");
                        exibirBanco(array_bancos);
                        System.out.printf("%n");
                        int banco = key.nextInt();
                        contaCorrente.setBanco(array_bancos.get(banco));

                        System.out.printf("Numero da conta:%n");
                        int nrConta = key.nextInt();
                        contaCorrente.setNroConta(nrConta);

                        String buffer93 = key.nextLine();

                        System.out.printf("Senha:%n");
                        String senha = key.nextLine();
                        contaCorrente.setSenha(senha);

                        System.out.printf("Taxa ao mês da conta:%n");
                        double tax = key.nextDouble();
                        contaCorrente.setTaxMes(tax);

                        contaCorrente.getTitular().setContasBancarias(contaCorrente);
                        array_corrente.add(contaCorrente);

                        contaCorrente.Info();

                    }
                    if (conta == 0 ){

                        Conta_Poupanca contaPolpa = new Conta_Poupanca();

                        System.out.println("Selecione Titular:");
                        exibirClientes(array_clietes);
                        System.out.println("");
                        int nome = key.nextInt();
                        contaPolpa.setTitular(array_clietes.get(nome));

                        System.out.println("Selecione Banco:");
                        exibirBanco(array_bancos);
                        System.out.println("");
                        int banco = key.nextInt();
                        contaPolpa.setBanco(array_bancos.get(banco));

                        System.out.println("Numero da conta:");
                        int nrConta = key.nextInt();
                        contaPolpa.setNroConta(nrConta);

                        String buffer1283 = key.nextLine();

                        System.out.println("Senha:");
                        String senha = key.nextLine();
                        contaPolpa.setSenha(senha);

                        array_poupanca.add(contaPolpa);

                        contaPolpa.Info();

                    }

                }
                case 4 ->{

                    System.out.println("Informações dos Cliente");
                    System.out.println("Digite o CPF: (XXX.XXX.XXX-XX)");

                    String buffer933 = key.nextLine();

                    String CPF = key.nextLine();

                    int flag = 0;

                    for (Pessoa arrayCliete : array_clietes) {
                        if (arrayCliete.getCpf().equals(CPF)) {
                            flag++;
                            arrayCliete.Info();

                        }
                    }

                    if (flag == 0) {
                        System.out.println("CPF não encontrado");
                    }

                }
                case 5 ->{

                    System.out.println("Informações dos Bancos");
                    System.out.println("Digite o Numero do Banco: [XXXX]");

                    int numeroBanco = key.nextInt();

                    int flag = 0;

                    for (Banco arrayBanco : array_bancos) {
                        if (arrayBanco.getNroBanco() == numeroBanco) {
                            flag++;
                            arrayBanco.infoBanco();

                        }
                    }

                    if (flag == 0) {
                        System.out.println("Banco não encontrado");
                    }

                }
                case 6 ->{
                    System.out.println("Sacar:[0]Conta Corrente x [1]Conta Poupança");

                    int sacConta = key.nextInt();

                    int flag = 0;

                    if (sacConta == 0){

                        System.out.println("Numero da conta corrente");

                        int numeroContaCorre = key.nextInt();

                        for (Conta_Corrente contaCorrente : array_corrente) {
                            if (contaCorrente.getNroConta() == numeroContaCorre) {
                                flag = 1;
                                contaCorrente.Saque();

                            }
                        }

                        if (flag == 0) {

                            System.out.println("Conta não encontrada");

                        }


                    }

                    if (sacConta == 1){



                    }

                }
                case 0 -> System.exit(1);
                default -> System.out.println("Tente novamente");


           }
        }

    }

    public static void exibirClientes(ArrayList<Pessoa> array_clietes){

        for (int i = 0; i < array_clietes.size(); i++) {
            System.out.printf("[%s] - %s " ,i , array_clietes.get(i));
        }

    }

    public static void exibirBanco(ArrayList<Banco> array_bancos){

        for (int i = 0; i < array_bancos.size(); i++) {
            System.out.printf("[%s] - %s " ,i , array_bancos.get(i));
        }

    }
}

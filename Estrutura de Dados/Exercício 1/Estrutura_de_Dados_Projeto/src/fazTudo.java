import java.util.Scanner;

//GENARIZAÇÃO

public class fazTudo {

    private int tamanho;

    fazTudo(int tamanho){

    this.tamanho = tamanho


    }

    public static void Operacao4(int vetConsulta[]) {
        //consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor

        Scanner key = new Scanner(System.in);

        int escolha,flag;

        flag = 0;

        System.out.println("Digite o valor que deseja consultar:");
        escolha = key.nextInt();

        for(int i = 0; i < this.vetConsulta.length; i++) {

            if(escolha == this.vetConsulta[i]) {

                System.out.println("Valor encontrado no elemento: " + i);
                flag++;
                break;

            }

        }
        if(flag == 0 ){

            System.out.println("Valor não encontrado");

        }

    }

    

}

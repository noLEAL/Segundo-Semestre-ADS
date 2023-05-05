import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int opition,size;
        classeVetor myObject;

        while(true) {

            System.out.println("=".repeat(100));

            System.out.println("1. Preencher o vetor do objeto com números pseudo-randômicos, em uma distribuição que minimize a possibilidade de valores duplicados.");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");

            System.out.println("=".repeat(100));

            opition = key.nextInt();

            switch (opition){
                case 1:
                    size = key.nextInt();
                    myObject = new classeVetor(size);


                    break;
            }


        }

    }
}
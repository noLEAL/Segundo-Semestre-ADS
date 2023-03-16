
import java.util.Scanner;

public class revisao {	

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		 
		
		int escolha;
		
		System.out.println("Escolha uma da opções:");
			System.out.println("(1)Criar o vetor vazio ou \"zerar o vetor\"");
			System.out.println("(2)inserir um valor no vetor - utilizando uma estratégia para que o próximo elemento vazio receba este novo valor");
			System.out.println("(3)apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser \"zerado\"");
			System.out.println("(4)consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor");
			System.out.println("(5)consultar quantos valores significativos já ocupam o vetor");
			System.out.println("(6)consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor");
			System.out.println("(7)consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor");
			System.out.println("(8)apresentar uma listagem dos valores armazenados no vetor"); 
			System.out.println("(0)sair do programa"); // ok
			
			escolha = key.nextInt();
			
			if (escolha == 1) {
				
				Operacao1();
				
			}else if(escolha == 2){
				
				Operacao2();
				
			}else if(escolha == 3) {
				
				Operacao3();
				
			}else if(escolha == 4) {
				
				Operacao4();
				
			}else if(escolha == 5) {
				
				Operacao5();
				
			}else if(escolha == 6) {
				
				Operacao6();
				
			}else if(escolha == 7) {
				
				Operacao7();
				
			}else if(escolha == 8) {
				
				Operacao8();
				
			}else if(escolha == 0) {
				
				Operacao0();
				
			}

	}
	
	static void Operacao1() {
		
		int vetor[] = new int[20];
		
		
		for(int i = 0; i <= vetor.length-1; i++) {
			
			vetor[i] = 0;
			
		}
		
		
		
		for(int i =0; i <= vetor.length-1; i++) {
			
			System.out.println("Valor na possição:" + i + "é:" + vetor[i]);
			
		}
		
		
		
		System.out.println("Hellol Word!!!");
		
	}
	
	
	static int Operacao2() {
		
		
		
	}
	
	static int Operacao3() {
		
		
		
	}
	
	static int Operacao4() {
		
		
		
	}
	
	static int Operacao5() {
		
		
		
	}
	
	static int Operacao6() {
		
		
		
	}
	
	static int Operacao7() {
		
		
		
	}
	
	static int Operacao8() {
		

		
	}
	
	static void Operacao0() {
		
		
		
	}
}

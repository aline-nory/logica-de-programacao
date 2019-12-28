package repeticao;

import java.util.Scanner;

public class BaseExpoente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");	
		int base = scan.nextInt(); 

		System.out.println("Entre com a potência:");	
		int pot = scan.nextInt();
		scan.close();

		int resultado = base;

		for(int i = 1; i <pot; i++) {
			resultado *= base;
		}
		System.out.println("O resultado é: " + resultado);	
	}
}

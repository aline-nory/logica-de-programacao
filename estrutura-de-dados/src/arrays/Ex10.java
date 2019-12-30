package arrays;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int soma = 0;
		int impar = 0;

		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			vetorA[i] = scan.nextInt();				
		}

		for(int i=0; i<vetorA.length; i++) {
			soma += vetorA[i];
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + (soma/vetorA.length));
		scan.close();
	}
}



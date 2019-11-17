package arrays;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		int[] vetorA = new int[5];
		int soma = 0;
		int impar = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			Scanner scan = new Scanner(System.in);
			vetorA[i] = scan.nextInt();			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + (soma/impar));
	}
	}



package arrays;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorA[i] == 1) {
				qtd0++;
			} else {
				qtd1++;
			}			
		}
		
		// Regra de três para saber a porcentagem de 0 e de 1.
		// vetorA.length 	- 100
		// qtd0 			- x
		// vetorA.length * x ==  qtd0 * 100
		// x = (qtd0 * 100) / vetorA.length
		
		double porc0 = (qtd0 * 100) / vetorA.length;
		double porc1 = 100 - porc0;
		
		System.out.println();
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Porcentagem de 0: " + porc0 + "%");
		System.out.println();
		System.out.println("Porcentagem de 1: " + porc1 + "%");
	}
}

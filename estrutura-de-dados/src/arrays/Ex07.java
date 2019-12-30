/*
 * Implementar um programa que defina a quantidade 
 * de elementos no vetor que são pares
 */

package arrays;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			vetorA[i] = scan.nextInt();
		}
				
		int qtdPares = 0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
				System.out.println("Numeros pares: " + vetorA[i]);
			}			
		}	
		System.out.println("Total: " + qtdPares);
		scan.close();
	}
}

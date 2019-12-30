/*
 * Criar um vetorA com 15 elementos inteiros.
 * Criar um vetorB de mesmo tipo e tamanho, senho que cada elemento
 * do vetorB deverá ser o quadrado do respectivo elemento A, ou seja:
 * B[i] = A[i] * A[i].
 */

package arrays;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com uma posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}

		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		scan.close();
	}
}

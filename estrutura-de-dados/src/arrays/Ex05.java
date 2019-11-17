/*
 * B[i] = A[i] * i;
 */

package arrays;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com a primeira posição:" + i);
			vetorA[i] = scan.nextInt();
			
			//vetorB[i] = vetorA[i] * i;
			
			// Se você quiser que o vetor B seja o retso da divisao de A por 2
			//Faça:
			
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.println("vetor A:");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println();
		
		System.out.println("vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
	}

}

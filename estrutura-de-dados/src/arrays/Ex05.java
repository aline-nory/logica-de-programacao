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
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.println("vetor A:");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		scan.close();
	}
}

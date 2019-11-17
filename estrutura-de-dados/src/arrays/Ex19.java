package arrays;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {

			System.out.println("Entre com um número:" + 1);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}

		System.err.println("Vetor B = ");
		for(int i=0; i<vetorA.length; i++) {
			System.err.print(vetorB[i] + " ");
		}
		System.err.println();
} }
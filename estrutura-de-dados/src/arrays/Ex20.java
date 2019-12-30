package arrays;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número de A " + (i+1));
			vetorA[i] = scan.nextInt();	
			System.out.println("Entre com um número de B " + (i+1));
			vetorB[i] = scan.nextInt();
			vetorC[i] = (vetorA[i] == vetorB[i]) ? 0 : (vetorA[i] > vetorB[i]) ? 1 : -1;		
		}
	
		System.out.println("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor C = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		scan.close();
	}
}

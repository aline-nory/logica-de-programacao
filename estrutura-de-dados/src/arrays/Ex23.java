package arrays;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int [5];
		int[] vetorB = new int [vetorA.length];
		int[] vetorC = new int [vetorA.length * 2];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número de A: " + (i+1));
			vetorA[i] = scan.nextInt();
			vetorC[i] = vetorA[i];
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com o número de B: " + (i+1));
			vetorB[i] = scan.nextInt();		
			vetorC[vetorA.length + i] = vetorB[i];
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
		System.out.println();
		
		System.out.println("Vetor C: ");
		for(int i=0; i<vetorC.length; i++) {			
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		
	}

}

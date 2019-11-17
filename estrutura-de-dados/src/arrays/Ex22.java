package arrays;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {

			System.out.println("Entre com um número de A: " + i);
			vetorA[i] = scan.nextInt();		
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
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
		
		}
	
	}


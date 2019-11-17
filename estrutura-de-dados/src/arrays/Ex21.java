package arrays;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length]; //Se deixar int vai imprimir o valor da tabel ascii
		
		for(int i=0; i<vetorA.length; i++) {

			System.out.println("Entre com um número de A:" + 1);
			vetorA[i] = scan.nextInt();
				
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}  else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10 ) {
				vetorB[i] = 'e';
			}
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



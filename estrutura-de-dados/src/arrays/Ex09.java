/*
 * Criar umm vetor A com 10 elementos inteiros.
 * Implementar um programa que determine a soma dos elementos armazenados
 * neste vetor que são multiplos de 5.
 * 
 */

package arrays;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int total = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			vetorA[i] = scan.nextInt();			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 5 == 0) {
				total += vetorA[i];
			}
		}
		System.out.println();
		System.out.println(total);
		scan.close();
	}

}

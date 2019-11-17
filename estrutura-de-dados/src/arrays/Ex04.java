/*
 * Criar um vetorA com 15 elementos inteiros.
 * Criar um vetorB de mesmo tipo e tamanho, sendo que cada elemento
 * do vetorB deverá ser o quadrado do respectivo elemento A, ou seja:
 * B[i] = sqrt(A[i])
 */

package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com uma posição:" + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);		
		}
		
		System.out.println("Vetor A:");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			System.out.println(df.format(vetorB[i]));
		}
	}

}

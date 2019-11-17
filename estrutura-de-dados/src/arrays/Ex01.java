/*
 * Criar um vetor A com 5 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos do vetor A,
 * ou seja, B[i] = A[i] (atribuir os vetores de a ao vetor b);
 *  
 */


package arrays;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[a.length];//
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("Entre com a posição: " + i);
			a[i] = scan.nextInt();			
			b[i] = a[i];
		}

		System.out.println("Vetor A: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
	}
}

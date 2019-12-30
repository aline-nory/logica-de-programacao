package arrays;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int impares = 0;
				
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			vetorA[i] = scan.nextInt();	
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impares++;
			} 
		}
		
		int par = vetorA.length - impares;		
		double porcentPar = (par*100) / vetorA.length;
		double porcentImpar = 100 - porcentPar; 
		
		System.out.println("Pares: " + porcentPar + "%");
		System.out.println("Impares: " + porcentImpar + "%");
		scan.close();
		
	}
}

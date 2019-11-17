package arrays;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int impares = 0;
				
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			Scanner scan = new Scanner(System.in);
			vetorA[i] = scan.nextInt();			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impares++;
			} 
		}
		
		int par = vetorA.length - impares;
		//REGRA DE TRÊS//
			//vetorA.length - 100%
			//par           - x;
			// x*vetorA.length == par*100
			// x==(par*100)/vetorA.length
			
		double porcPar = (par*100) / vetorA.length;
		double porcImpar = 100 - porcPar; //?
		
		System.out.println("Pares: " + porcPar + "%");
		System.out.println("Impares: " + porcImpar + "%");
		
	}
}

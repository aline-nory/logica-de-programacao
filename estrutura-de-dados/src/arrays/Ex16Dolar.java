/*
 * Implementar um programa que obtenha a cota��o do dolar(U$)
 * em rela��o ao real (R$)
 * 
 */

package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16Dolar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double cotacaoDolar;
		
		System.out.println("Entre com a cota��o do d�lar");
		cotacaoDolar = scan.nextDouble();
		
		double[] vetorA = new double[3];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor em d�lar U$: ");
			vetorA[i] = scan.nextDouble();			
		}
		
		System.out.println();
		System.out.println("Valor em d�lar: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("U$ " + df.format(vetorA[i]));	
		}
		
		
		double total = 0;
		for(int i=0; i<vetorA.length; i++) {						
			vetorA[i] = cotacaoDolar * vetorA[i];
		}
	
		System.out.println();
		System.out.println("Convers�o de d�lar para real: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("R$ " + df.format(vetorA[i]));
		}
	}

}

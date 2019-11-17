/*
 * Implementar um programa que obtenha a cotação do dolar(U$)
 * em relação ao real (R$)
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
		
		System.out.println("Entre com a cotação do dólar");
		cotacaoDolar = scan.nextDouble();
		
		double[] vetorA = new double[3];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor em dólar U$: ");
			vetorA[i] = scan.nextDouble();			
		}
		
		System.out.println();
		System.out.println("Valor em dólar: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("U$ " + df.format(vetorA[i]));	
		}
		
		
		double total = 0;
		for(int i=0; i<vetorA.length; i++) {						
			vetorA[i] = cotacaoDolar * vetorA[i];
		}
	
		System.out.println();
		System.out.println("Conversão de dólar para real: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("R$ " + df.format(vetorA[i]));
		}
	}

}

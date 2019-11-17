/*******************************************************************************
 * Faça um programa que calcule e escreva o numero de anos necessários 
 * para que a população do país A ultrapasse ou iguale a população do país B,
 * mantidas as taxas de crescimento.
 *******************************************************************************/

package repeticao;

public class Ex12Populacao {

	public static void main(String[] args) {

		double popA = 5000;
		int popB = 200000;
		int cont = 0;

		while(popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);	
	}
}

/***********************************************************************
 * Fa�a um programa que receba dois numeros inteiros e gere os n�meros 
 * inteiros que est�o no intervalo compreendidos por eles.
 ***********************************************************************/

package repeticao;

import java.util.Scanner;

public class IntervalodDeValores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero:");
		int primeiroNumero = scan.nextInt();

		System.out.println("Entre com o segundo n�mero:");
		int segundoNumero = scan.nextInt();

		scan.close();

		for(int i = primeiroNumero; i<=segundoNumero; i++) {
			System.out.println(i);
		}
	}
}

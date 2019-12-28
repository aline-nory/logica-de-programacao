/***********************************************************************
 * Faça um programa que receba dois numeros inteiros e gere os números 
 * inteiros que estão no intervalo compreendidos por eles.
 ***********************************************************************/

package repeticao;

import java.util.Scanner;

public class IntervalodDeValores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número:");
		int primeiroNumero = scan.nextInt();

		System.out.println("Entre com o segundo número:");
		int segundoNumero = scan.nextInt();

		scan.close();

		for(int i = primeiroNumero; i<=segundoNumero; i++) {
			System.out.println(i);
		}
	}
}

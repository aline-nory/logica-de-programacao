/***********************************************************************
 * Faça um programa que receba dois numeros inteiros e gere os números 
 * inteiros que estão no intervalo compreendidos por eles.
 ***********************************************************************/

package repeticao;

import java.util.Scanner;

public class Ex11IntervalodDosNumeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num1 = scan.nextInt();

		System.out.println("Entre com um número:");
		int num2 = scan.nextInt();

		scan.close();

		for(int i = num1; i<=num2; i++) {
			System.out.println(i);
		}
	}
}

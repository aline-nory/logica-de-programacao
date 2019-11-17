/*****************************************************************
 * Faça um programa que peça dois numeros e imprima o maior deles.
 *****************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex08RetornaMaiorNumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num1 = scan.nextInt();

		System.out.println("Entre com um outro número:");
		int num2 = scan.nextInt();
		
		scan.close();

		if (num1 > num2) {
			System.out.println("O numero maior é " + num1);
		} else {
			System.out.println("O numero maior é " + num2);
		}
	}
}
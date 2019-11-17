/*****************************************************************
 * Faça um programa que leia três números e retorne o maior deles.
 *****************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex09RetornaMaiorNumeroEntreTres {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		scan.close();

		if (num1 >= num2 && num1 > num3) {
			System.out.println("O primeiro numero foi o maior. Você digitou " + num1 + ".");
		} else if (num2 >= num1 && num2 > num3) {
			System.out.println("O segundo numero foi o maior. Você digitou " + num2 + ".");
		} else if (num3 >= num1 && num3 > num2) {
			System.out.println("O terceiro numero foi o maior. Você digitou " + num3 + ".");
		}
	}
}

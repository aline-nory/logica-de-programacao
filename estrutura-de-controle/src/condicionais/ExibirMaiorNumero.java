/*****************************************************************
 * Faça um programa que leia três números e retorne o maior deles.
 *****************************************************************/

package condicionais;

import java.util.Scanner;

public class ExibirMaiorNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int primeiroNumero = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int segundoNumero = scan.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int terceiroNumero = scan.nextInt();
		
		scan.close();

		if (primeiroNumero >= segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro numero foi o maior. Você digitou " + primeiroNumero + ".");
		} else if (segundoNumero >= primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo numero foi o maior. Você digitou " + segundoNumero + ".");
		} else if (terceiroNumero >= primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("O terceiro numero foi o maior. Você digitou " + terceiroNumero + ".");
		}
	}
}

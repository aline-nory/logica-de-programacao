/*********************************************************************************
 * Faça um programa que peça um valor e mostre na tela se é positivo ou negativo.
 * 
 *********************************************************************************/

package condicionais;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:\n");
		int num = scan.nextInt();

		scan.close();
		
		if (num >= 0) {
			System.out.println("O numero " + num + " é positivo.");
		} else {
			System.out.println("O numero " + num + " é negativo.");
		}
	}
}
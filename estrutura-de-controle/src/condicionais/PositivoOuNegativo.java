/*********************************************************************************
 * Fa�a um programa que pe�a um valor e mostre na tela se � positivo ou negativo.
 * 
 *********************************************************************************/

package condicionais;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n�mero:\n");
		int num = scan.nextInt();

		scan.close();
		
		if (num >= 0) {
			System.out.println("O numero " + num + " � positivo.");
		} else {
			System.out.println("O numero " + num + " � negativo.");
		}
	}
}
/***************************************************************************
 * Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e 
 * mostre em graus Farenheit.
 * 
 ***************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex06CalculaCelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Celsius:");
		double c = scan.nextDouble();
		scan.close();

		double f = (1.8 * c) + 32;

		System.out.println("A temperatura " + c + "C � igual a " + f + "F");

	}
}

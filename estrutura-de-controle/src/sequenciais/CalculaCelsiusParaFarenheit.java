/***************************************************************************
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e 
 * mostre em graus Farenheit.
 * 
 ***************************************************************************/

package sequenciais;

import java.util.Scanner;

public class CalculaCelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Celsius:");
		double celsius = scan.nextDouble();
		scan.close();

		double farenheit = (1.8 * celsius) + 32;

		System.out.println("A temperatura " + celsius + "C é igual a " + farenheit + "F");

	}
}

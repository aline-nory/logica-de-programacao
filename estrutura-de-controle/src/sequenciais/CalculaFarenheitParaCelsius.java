/***************************************************************************
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
 * mostre a temperatura em graus Celsius C = (5 * (F-32) / 9).
 * 
 ***************************************************************************/

package sequenciais;

import java.util.Scanner;

public class CalculaFarenheitParaCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Farenheit:");
		double farenheit = scan.nextDouble();
		scan.close();

		double celsius = (5 * (farenheit - 32) / 9);

		System.out.println("A temperatura em celsius é: " + celsius);

	}
}

/********************************************************************************
 * Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro
 * dessa área para o úsuario.
 ********************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex02CalculaAreaDoQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a área do quadrado:");
		double lado = scan.nextDouble();
		scan.close();

		double area = Math.pow(lado, 2); //lado * lado

		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro da area do quadrado é: " + (area * 2));

	}
}

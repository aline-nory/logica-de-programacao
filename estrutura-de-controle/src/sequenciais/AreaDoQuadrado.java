/********************************************************************************
 * Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre o dobro
 * dessa �rea para o �suario.
 ********************************************************************************/

package sequenciais;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o lado do quadrado");
		double lado = scan.nextDouble();
		scan.close();

		double area = Math.pow(lado, 2); 

		System.out.println("A area do quadrado �: " + area);
		System.out.println("O dobro da area do quadrado �: " + (area * 2));

	}
}

/******************************************************************************
 * Fa�a um programa que pe�a os tr�s lados de um tri�ngulo. O programa dever�
 * informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem
 * um tri�ngulo, se o mesmo � equil�tero, is�sceles ou escaleno.
 * 
 ******************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex20VerificaTipoDeTriangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o lado 1: ");
		int lado1 = scan.nextInt();

		System.out.println("Entre com o lado 2: ");
		int lado2 = scan.nextInt();

		System.out.println("Entre com o lado 3: ");
		int lado3 = scan.nextInt();

		scan.close();
		
		if (((lado1 + lado2) > lado3) || 
				((lado1 + lado3) > lado2) || 
				((lado3 + lado2) > lado1)) {
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo equil�tero.");
			} else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Tri�ngulo escaleno.");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo is�celes.");
			}	
		} else {
			System.out.println("N�o forma um tri�ngulo.");
		}	
	}
}

/******************************************************************************
 * Faça um programa que peça os três lados de um triângulo. O programa deverá
 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
 * um triângulo, se o mesmo é equilátero, isósceles ou escaleno.
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
				System.out.println("Triângulo equilátero.");
			} else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo escaleno.");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo isóceles.");
			}	
		} else {
			System.out.println("Não forma um triângulo.");
		}	
	}
}

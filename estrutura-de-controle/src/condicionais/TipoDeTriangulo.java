/******************************************************************************
 * Fa�a um programa que pe�a os tr�s lados de um tri�ngulo. O programa dever�
 * informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem
 * um tri�ngulo, se o mesmo � equil�tero, is�sceles ou escaleno.
 * 
 ******************************************************************************/

package condicionais;

import java.util.Scanner;

public class TipoDeTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do primeiro lado do tri�ngulo: ");
		double primeiroLado = scan.nextDouble();

		System.out.println("Entre com o tamanho do segundo lado do tri�ngulo: ");
		double segundoLado = scan.nextDouble();

		System.out.println("Entre com o tamanho do terceiro lado do tri�ngulo: ");
		double terceiroLado = scan.nextDouble();

		scan.close();
		
		if (((primeiroLado + segundoLado) > terceiroLado) || 
				((primeiroLado + terceiroLado) > segundoLado) || 
				((terceiroLado + segundoLado) > primeiroLado)) {
			if(primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
				System.out.println("Tri�ngulo equil�tero.");
			} else if(primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado) {
				System.out.println("Tri�ngulo escaleno.");
			} else if(primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Tri�ngulo is�celes.");
			}	
		} else {
			System.out.println("N�o forma um tri�ngulo.");
		}	
	}
}

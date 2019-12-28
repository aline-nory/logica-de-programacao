/******************************************************************************
 * Faça um programa que peça os três lados de um triângulo. O programa deverá
 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
 * um triângulo, se o mesmo é equilátero, isósceles ou escaleno.
 * 
 ******************************************************************************/

package condicionais;

import java.util.Scanner;

public class TipoDeTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do primeiro lado do triângulo: ");
		double primeiroLado = scan.nextDouble();

		System.out.println("Entre com o tamanho do segundo lado do triângulo: ");
		double segundoLado = scan.nextDouble();

		System.out.println("Entre com o tamanho do terceiro lado do triângulo: ");
		double terceiroLado = scan.nextDouble();

		scan.close();
		
		if (((primeiroLado + segundoLado) > terceiroLado) || 
				((primeiroLado + terceiroLado) > segundoLado) || 
				((terceiroLado + segundoLado) > primeiroLado)) {
			if(primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
				System.out.println("Triângulo equilátero.");
			} else if(primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado) {
				System.out.println("Triângulo escaleno.");
			} else if(primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Triângulo isóceles.");
			}	
		} else {
			System.out.println("Não forma um triângulo.");
		}	
	}
}

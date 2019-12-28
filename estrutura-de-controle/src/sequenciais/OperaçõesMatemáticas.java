/*************************************************************************************
 * Fa�a um programa que pe�a dois n�meros inteiros e um n�mero real, calcule e mostre:
 * 	a) O produto do dobro do primeiro com metade do segundo;
 * 	b) A soma do triplo do primeiro com o terceiro;
 * 	c) O terceiro elevado ao cubo;
 *************************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Opera��esMatem�ticas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Entre com um n�mero inteiro:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Entre com outro n�mero inteiro:");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Entre com um n�mero real:");
		double terceiroNumero = scan.nextDouble();
		
		scan.close();
		
		int resultadoA = (primeiroNumero * 2) * (segundoNumero /2);
		double resultadoB = (primeiroNumero * 3) * terceiroNumero;
		double resultadoC = Math.pow(terceiroNumero, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB);
		System.out.println("O terceiro elevado ao cubo: " + resultadoC);
	}
}

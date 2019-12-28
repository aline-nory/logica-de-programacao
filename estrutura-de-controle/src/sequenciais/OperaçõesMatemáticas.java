/*************************************************************************************
 * Faça um programa que peça dois números inteiros e um número real, calcule e mostre:
 * 	a) O produto do dobro do primeiro com metade do segundo;
 * 	b) A soma do triplo do primeiro com o terceiro;
 * 	c) O terceiro elevado ao cubo;
 *************************************************************************************/

package sequenciais;

import java.util.Scanner;

public class OperaçõesMatemáticas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Entre com um número inteiro:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Entre com outro número inteiro:");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Entre com um número real:");
		double terceiroNumero = scan.nextDouble();
		
		scan.close();
		
		int resultadoA = (primeiroNumero * 2) * (segundoNumero /2);
		double resultadoB = (primeiroNumero * 3) * terceiroNumero;
		double resultadoC = Math.pow(terceiroNumero, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB);
		System.out.println("O terceiro elevado ao cubo: " + resultadoC);
	}
}

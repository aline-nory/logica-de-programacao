/*************************************************************************************
 * Faça um programa que peça dois números inteiros e um número real, calcule e mostre:
 * 	a) O produto do dobro do primeiro com metade do segundo;
 * 	b) A soma do triplo do primeiro com o terceiro;
 * 	c) O terceiro elevado ao cubo;
 *************************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex04ExercicioDeOperaçõesMatemáticas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Entre com um número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com um número real:");
		double num3 = scan.nextDouble();
		
		scan.close();
		
		int resultado1 = (num1 * 2) * (num2 /2);
		double resultado2 = (num1 * 3) * num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado de a" + resultado1);
		System.out.println("Resultado de b" + resultado2);
		System.out.println("Resultado de c" + resultado3);
	}
}

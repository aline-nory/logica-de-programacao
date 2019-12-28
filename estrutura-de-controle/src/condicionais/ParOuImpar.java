/************************************************************************
 * Faça um programa que peça um número inteiro  e determine se ele é par
 * ou impar. Dica: utilize o operador módulo (resto da divisão)
 ************************************************************************/

package condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		scan.close();
		
		if(num % 2 == 0) {
			System.out.println("Número par.");
		} else {
			System.out.println("Número ímpar.");
		}
	}
}

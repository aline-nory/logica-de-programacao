/************************************************************************
 * Faça um programa que peça um número inteiro  e determine se ele é par
 * ou impar. Dica: utilize o operador módulo (resto da divisão)
 ************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex17VerificaSeNumeroParOuImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		int num = scan.nextInt();

		scan.close();
		
		if(num % 2 == 0) {
			System.out.println("Numero Par.");
		} else {
			System.out.println("Numero impar.");
		}
	}
}

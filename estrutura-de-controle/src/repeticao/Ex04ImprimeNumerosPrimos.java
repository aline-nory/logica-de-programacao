/*****************************************************************************
 * Faça um programa que peça um numero inteiro e determine se ele é ou não um 
 * número primo. Um número primo é aquele que é divisível somente por ele mesmo 
 * e por 1.
 ******************************************************************************/

package repeticao;

import java.util.Scanner;

public class Ex04ImprimeNumerosPrimos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número inteiro:");
		int num = scan.nextInt();

		boolean primo = true; //Flag
		scan.close();

		for(int i=2; i<num; i++) { 
			if(num % i == 0) {
				primo = false;
			}
		}
		if(primo) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
	}	
}

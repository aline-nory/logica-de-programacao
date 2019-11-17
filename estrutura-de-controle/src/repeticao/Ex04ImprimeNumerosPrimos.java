/*****************************************************************************
 * Fa�a um programa que pe�a um numero inteiro e determine se ele � ou n�o um 
 * n�mero primo. Um n�mero primo � aquele que � divis�vel somente por ele mesmo 
 * e por 1.
 ******************************************************************************/

package repeticao;

import java.util.Scanner;

public class Ex04ImprimeNumerosPrimos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n�mero inteiro:");
		int num = scan.nextInt();

		boolean primo = true; //Flag
		scan.close();

		for(int i=2; i<num; i++) { 
			if(num % i == 0) {
				primo = false;
			}
		}
		if(primo) {
			System.out.println("� primo");
		} else {
			System.out.println("N�o � primo");
		}
	}	
}

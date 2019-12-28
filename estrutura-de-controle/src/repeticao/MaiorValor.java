/************************************************************************
 * Faça um programa que leia cinco números e imprima o maior número.
 ************************************************************************/
package repeticao;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maiorNumero = Integer.MIN_VALUE;

		for(int i = 0; i<5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();

			if(num > maiorNumero) {
				maiorNumero = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maiorNumero);
		scan.close();
	}
}

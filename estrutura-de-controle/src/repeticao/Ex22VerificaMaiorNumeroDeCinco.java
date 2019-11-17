/************************************************************************
 * Faça um programa que leia cinco números e imprima o maior número.
 ************************************************************************/
package repeticao;

import java.util.Scanner;

public class Ex22VerificaMaiorNumeroDeCinco {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for(int i = 0; i<5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();

			if(num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		scan.close();
	}
}

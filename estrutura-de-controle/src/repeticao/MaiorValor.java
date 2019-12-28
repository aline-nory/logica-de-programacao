/************************************************************************
 * Fa�a um programa que leia cinco n�meros e imprima o maior n�mero.
 ************************************************************************/
package repeticao;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maiorNumero = Integer.MIN_VALUE;

		for(int i = 0; i<5; i++) {
			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();

			if(num > maiorNumero) {
				maiorNumero = num;
			}
		}
		System.out.println("O maior n�mero digitado foi: " + maiorNumero);
		scan.close();
	}
}

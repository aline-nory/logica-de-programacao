/*****************************************************************************************
 * Fa�a um programa que leia 10 n�meros e informe a quantidade de n�meros pares e �mpares.
 *****************************************************************************************/
package repeticao;

import java.util.Scanner;

public class ExibirValorParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int pares = 0;
		int impares = 0;

		for(int i = 0; i <10; i++) {
			System.out.println("Entre com um n�mero:");	
			num = scan.nextInt();	

			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}	
		scan.close();
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de impares: " + impares);
	}
}


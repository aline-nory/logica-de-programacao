/********************************************************************************
 * Fa�a um programa que leia 5 n�meros e imprima a soma e a m�dia desses n�meros.
 ********************************************************************************/

package repeticao;

import java.util.Scanner;

public class Ex08ImprimirSomaEMedia {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);

		int num;
		int soma = 0;

		for(int i = 0; i<5; i++) {
			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();
			soma += num;
		}

		scan.close();

		double media = soma/5;

		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
	}
}



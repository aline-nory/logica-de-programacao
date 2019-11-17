/********************************************************************************
 * Faça um programa que leia 5 números e imprima a soma e a média desses números.
 ********************************************************************************/

package repeticao;

import java.util.Scanner;

public class Ex08ImprimirSomaEMedia {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);

		int num;
		int soma = 0;

		for(int i = 0; i<5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			soma += num;
		}

		scan.close();

		double media = soma/5;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}



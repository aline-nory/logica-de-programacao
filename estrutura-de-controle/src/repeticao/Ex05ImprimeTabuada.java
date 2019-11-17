/*************************************************************************************
 * Faça um programa que imprima na tela a tabuada correspondente ao número informado.
 *************************************************************************************/
package repeticao;

import java.util.Scanner;

public class Ex05ImprimeTabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número:");
		int num = scan.nextInt();
		scan.close();

		for(int i=0; i<=10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
		}
	}
}

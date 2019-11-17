/**************************************************************************************
 * Fa�a um programa que pe�a um n�mero correspondente a um determinado ano e em seguida
 * informe se este ano � ou n�o bissexto.
 **************************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex01CalculaAnoBissexto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um ano:");
		int ano = scan.nextInt();
		
		scan.close();

		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Ano � bissexto");
		} else {
			System.out.println("N�o ano � bissexto");
		}
	}
}

/**************************************************************************************
 * Faça um programa que peça um número correspondente a um determinado ano e em seguida
 * informe se este ano é ou não bissexto.
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
			System.out.println("Ano é bissexto");
		} else {
			System.out.println("Não ano é bissexto");
		}
	}
}

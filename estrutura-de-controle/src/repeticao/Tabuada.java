/*************************************************************************************
 * Fa�a um programa que imprima na tela a tabuada correspondente ao n�mero informado.
 *************************************************************************************/
package repeticao;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero:");
		int num = scan.nextInt();
		scan.close();

		for(int i=0; i<=10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
		}
		
		/*
		    for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
			}*/
	}
}

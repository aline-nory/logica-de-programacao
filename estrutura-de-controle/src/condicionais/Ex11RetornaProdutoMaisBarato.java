/***********************************************************
 * Faça um programa que pergunte o preço de três produtos
 * e informe qual produto você deve comprar, sabendo que a
 * decisão é sempre pelo mais barato:
 * 
 ***********************************************************/

package condicionais;

import java.util.Scanner;

public class Ex11RetornaProdutoMaisBarato {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto: ");
		double prod1 = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto: ");
		double prod2 = scan.nextDouble();
		
		System.out.println("Informe o preço do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		scan.close();

		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O produto mais barato é o primeiro");
		} else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O produto mais barato é o segundo");
		} else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O produto mais barato é o terceiro");
		}
		
	}

}

/***********************************************************
 * Fa�a um programa que pergunte o pre�o de tr�s produtos
 * e informe qual produto voc� deve comprar, sabendo que a
 * decis�o � sempre pelo mais barato:
 * 
 ***********************************************************/

package condicionais;

import java.util.Scanner;

public class Ex11RetornaProdutoMaisBarato {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do primeiro produto: ");
		double prod1 = scan.nextDouble();
		
		System.out.println("Informe o pre�o do segundo produto: ");
		double prod2 = scan.nextDouble();
		
		System.out.println("Informe o pre�o do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		scan.close();

		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O produto mais barato � o primeiro");
		} else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O produto mais barato � o segundo");
		} else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O produto mais barato � o terceiro");
		}
		
	}

}

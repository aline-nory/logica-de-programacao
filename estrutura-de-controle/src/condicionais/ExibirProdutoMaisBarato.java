/***********************************************************
 * Fa�a um programa que pergunte o pre�o de tr�s produtos
 * e informe qual produto voc� deve comprar, sabendo que a
 * decis�o � sempre pelo mais barato:
 * 
 ***********************************************************/

package condicionais;

import java.util.Scanner;

public class ExibirProdutoMaisBarato {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do primeiro produto: ");
		double primeiroProduto = scan.nextDouble();
		
		System.out.println("Informe o pre�o do segundo produto: ");
		double segundoProduto = scan.nextDouble();
		
		System.out.println("Informe o pre�o do terceiro produto: ");
		double terceiroProduto = scan.nextDouble();
		
		scan.close();

		if (primeiroProduto <= segundoProduto && primeiroProduto <= terceiroProduto) {
			System.out.println("O produto mais barato � o primeiro");
		} else if (segundoProduto <= primeiroProduto && segundoProduto <= terceiroProduto) {
			System.out.println("O produto mais barato � o segundo");
		} else if (terceiroProduto <= primeiroProduto && terceiroProduto <= segundoProduto) {
			System.out.println("O produto mais barato � o terceiro");
		}
		
	}

}

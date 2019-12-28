/***********************************************************
 * Faça um programa que pergunte o preço de três produtos
 * e informe qual produto você deve comprar, sabendo que a
 * decisão é sempre pelo mais barato:
 * 
 ***********************************************************/

package condicionais;

import java.util.Scanner;

public class ExibirProdutoMaisBarato {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto: ");
		double primeiroProduto = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto: ");
		double segundoProduto = scan.nextDouble();
		
		System.out.println("Informe o preço do terceiro produto: ");
		double terceiroProduto = scan.nextDouble();
		
		scan.close();

		if (primeiroProduto <= segundoProduto && primeiroProduto <= terceiroProduto) {
			System.out.println("O produto mais barato é o primeiro");
		} else if (segundoProduto <= primeiroProduto && segundoProduto <= terceiroProduto) {
			System.out.println("O produto mais barato é o segundo");
		} else if (terceiroProduto <= primeiroProduto && terceiroProduto <= segundoProduto) {
			System.out.println("O produto mais barato é o terceiro");
		}
		
	}

}

/***************************************************************************
 * Um posto est� vendendo combust�veis com a seguinte tabela de descontos;
 * 		�lcool:
 * 			a) At� 20 litros, desconto de 3% por litro;
 * 			b) Acima de 20 litros, desconto de 5% por litro;
 * 		Gasolina:
 * 			c) At� 20 litros, desconto de 4% por litro;
 * 			d) Acima de 20 litros, desconto de 6% por litro;
 * Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de
 * combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), 
 * calcule e imprima o valor a ser pago pelo cliente.
 ****************************************************************************/

package condicionais;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tipo de combust�vel: A - �lcool / G - Gasolina \n");
		String tipo = scan.next();

		System.out.println("Quantidade de litros:");
		double litros = scan.nextDouble();
		
		scan.close();

		double precoGas = 2.9;
		double precoAlc = 1.9;
		int percentualDesc = 0;
		double total = 0;
		double totalDesc = 0;

		if(tipo.equalsIgnoreCase("A")) {
			if(litros <= 20) {
				percentualDesc = 3;
			} else if (litros > 20) {
				percentualDesc = 5;			
			}
			total = litros * precoAlc;
		} else if(tipo.equalsIgnoreCase("G")) {
			if(litros <= 20) {
				percentualDesc = 4;
			} else if (litros > 20) {
				percentualDesc = 6;			
			}
			total = litros * precoGas;
		}

		totalDesc = (total / 100) * percentualDesc;
		double precoApagar = total - totalDesc;

		System.out.println("Valor a ser pago R$: " + precoApagar);
	}
}
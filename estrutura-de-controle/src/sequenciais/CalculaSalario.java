/*******************************************************************************
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 * 
 *******************************************************************************/

package sequenciais;

import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor do salário por hora:");
		double salarioPorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
		double horasTrabalhadasNoMes = scan.nextDouble();
		scan.close();

		double salarioTotal = salarioPorHora * horasTrabalhadasNoMes;

		System.out.println("O salário é de: " + salarioTotal);

	}
}

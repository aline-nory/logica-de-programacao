/*******************************************************************************
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas 
 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 * 
 *******************************************************************************/

package sequenciais;

import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor do sal�rio por hora:");
		double salarioPorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no m�s:");
		double horasTrabalhadasNoMes = scan.nextDouble();
		scan.close();

		double salarioTotal = salarioPorHora * horasTrabalhadasNoMes;

		System.out.println("O sal�rio � de: " + salarioTotal);

	}
}

/*******************************************************************************
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas 
 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 * 
 *******************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex09CalculaSalarioPorHora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no m�s:");
		double horas = scan.nextDouble();
		scan.close();

		double salario = valorHora * horas;

		System.out.println("O salario � de: " + salario);

	}
}

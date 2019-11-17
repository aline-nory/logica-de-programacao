/******************************************************************************
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas 
 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, 
 * sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 
 * 5% para o sindicato. Fa�a um programa que nos d�:
 * 	a) Sal�rio bruto;
 * 	b) Quanto pagou ao INSS;
 * 	c) Quanto pagou ao sindicato;
 *	d) O sal�rio l�quido.
 *	e) Calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
 * 		+ Sal�rio Bruto : R$
 * 		- IR (11%) : R$
 * 		- INSS (8%) : R$
 * 		- Sindicato ( 5%) : R$
 * 		= Sal�rio Liquido : R$
 * 
 *******************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex08CalculaHorasTrabalhadasComDesconto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no m�s:");
		double horas = scan.nextDouble();
		scan.close();

		double salarioBruto = valorHora * horas;
		double iR = (salarioBruto/100) * 11;//
		double inss = (salarioBruto/100) * 8;//
		double sindicato = (salarioBruto/100) * 5;//
		double salarioLiquido = salarioBruto - inss - sindicato;

		System.out.println("Sal�rio bruto: R$ " + salarioBruto);
		System.out.println("Imposto de renda: R$ " + iR);
		System.out.println("INSS: R$ " + inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("Sal�rio liquido: R$ " + salarioLiquido);
	}
}

/******************************************************************************
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
 * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 
 * 5% para o sindicato. Faça um programa que nos dê:
 * 	a) Salário bruto;
 * 	b) Quanto pagou ao INSS;
 * 	c) Quanto pagou ao sindicato;
 *	d) O salário líquido.
 *	e) Calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * 		+ Salário Bruto : R$
 * 		- IR (11%) : R$
 * 		- INSS (8%) : R$
 * 		- Sindicato ( 5%) : R$
 * 		= Salário Liquido : R$
 * 
 *******************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex08CalculaHorasTrabalhadasComDesconto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
		double horas = scan.nextDouble();
		scan.close();

		double salarioBruto = valorHora * horas;
		double iR = (salarioBruto/100) * 11;//
		double inss = (salarioBruto/100) * 8;//
		double sindicato = (salarioBruto/100) * 5;//
		double salarioLiquido = salarioBruto - inss - sindicato;

		System.out.println("Salário bruto: R$ " + salarioBruto);
		System.out.println("Imposto de renda: R$ " + iR);
		System.out.println("INSS: R$ " + inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("Salário liquido: R$ " + salarioLiquido);
	}
}

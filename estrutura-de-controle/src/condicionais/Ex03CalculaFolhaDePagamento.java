/*****************************************************************************
 * Faça um programa o cálculo de uma folha de pagamento, sabendo que os descontos
 * são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
 *  e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não 
 *  é descontado (é a empresa que deposita). O salário liquído corresponde ao 
 *  Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor 
 *  da sua hora e a quantidade de horas trabalhadas no mês:
 *  	Desconto do IR:
 * 		Salário Bruto até 900 (inclusive) - isento 
 * 		Salário Bruto até 1500 (inclusive) - desconto de 5%
 * 		Salário Bruto até 2500 (inclusive) - desconto de 10%
 * 		Salário Bruto acima de 2500 - desconto de 20%.
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
 * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * 		Salário Bruto (5 * 220)		R$ 1100,00
 * 		IR (5%)						R$ 55,00
 * 		INSS (10%)					R$ 110,00
 * 		FGTS (11%)					R$ 121,00
 * 		Total de descontos			R$ 165,00
 * 		Salário Líquido				R$ 935,00
 *****************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex03CalculaFolhaDePagamento {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor da hora de trabalho:");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas por mês:");
		double qtdMes = scan.nextDouble();
		scan.close();

		double salarioBruto = valorHora * qtdMes;
		double percentualIr = 0;

		if(salarioBruto <= 900.00) {
			percentualIr = 0;
		} else if(salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			percentualIr = 5;
		} else if(salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			percentualIr = 10;
		} else if(salarioBruto >  2500.00) {
			percentualIr = 10;
		}

		double ir = (salarioBruto/100) * percentualIr;
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) * 11;
		double totalDesconto = ir + inss;
		double salarioLiquido = totalDesconto - salarioBruto;

		System.out.println("Salário Bruto (" + valorHora + " * " + qtdMes + "): R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualIr + "%): R$ " + ir);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("(-) FGTS (11%): R$ " + fgts);
		System.out.println("Total de descontos: R$ " + totalDesconto);
		System.out.println("Salario Líquido: R$ " + salarioLiquido);
	}
}

/******************************************************************************
 * Desenvolva um programa que calcula os reajustes:
 * 		Faça um programa que receba o sálario de um colaborador e o reajuste 
 * segundo o seguinte critério, baseado no salário atual:
 * 		Salários até R$ 280,00 (incluindo): aumento de 20%.
 * 		Salários entre R$ 280,00 E R$ 700,00: aumento de 15%;
 * 		Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
 * 		Salários de R$ 1500,00 em diante: aumento de 5%.
 * Após o aumento ser realizado, informe na tela:
 * 		O salário antes do reajuste;
 * 		O percentual de aumento aplicado;
 * 		O valor do aumento;
 * 		O novo salário após o aumento.
 ******************************************************************************/
package condicionais;

import java.util.Scanner;

public class Ex06CalculaReajusteSalarial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o seu salario: ");
		double salario = scan.nextDouble();
		scan.close();
		
		double percentual = 0;

		if(salario <= 280.00) {
			percentual = 20;
		}else if(salario > 280.00 && salario < 700.00) {
			percentual = 15;
		}else if(salario > 700.00 && salario < 1500.00) {
			percentual = 10;
		}else if(salario > 1500.00) {
			percentual = 5;
		}

		double aumento = salario/100 * percentual;
		double novoSalario = aumento + salario;
		System.out.println("Salário antes do reajuste: R$ " + salario);
		System.out.println("Percentual de aumento aplicado: 20%.");
		System.out.println("Valor do aumento: R$ " + aumento);
		System.out.println("Novo salario após aumento: R$ " + novoSalario);
	}
}

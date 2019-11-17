/************************************************************************************
 * Faça um programa que leia um número e retorne o mês correspondente.
 ************************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex15VerificaMes {

	public static void main(String[] args) {

		System.out.println("Informe um número de 1 a 12:");
		Scanner scan = new Scanner(System.in);
		int mes = scan.nextInt();
		scan.close();
		
		switch (mes) {
		case 1:
			System.out.println("O mês é Janeiro");
			break;
		case 2:
			System.out.println("O mês é Fevereiro");
			break;
		case 3:
			System.out.println("O mês é Março");
			break;
		case 4:
			System.out.println("O mês é Abril");
			break;
		case 5:
			System.out.println("O mês é Maio");
			break;
		case 6:
			System.out.println("O mês é Junho");
			break;
		case 7:
			System.out.println("O mês é Julho");
			break;
		case 8:
			System.out.println("O mês é Agosto");
			break;
		case 9:
			System.out.println("O mês é Setembro");
			break;
		case 10:
			System.out.println("O mês é Outubro");
			break;
		case 11:
			System.out.println("O mês é Novembro");
			break;
		case 12:
			System.out.println("O mês é Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}
	}
}


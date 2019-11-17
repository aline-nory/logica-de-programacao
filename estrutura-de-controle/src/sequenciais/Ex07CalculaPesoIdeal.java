/********************************************************************************
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58.
 ********************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex07CalculaPesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a altura:");
		double altura = scan.nextDouble();
		scan.close();

		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("O seu peso ideal é: " + pesoIdeal);

	}

}

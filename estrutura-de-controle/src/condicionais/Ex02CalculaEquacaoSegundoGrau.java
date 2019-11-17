/*******************************************************************************************
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma 
 * ax2 +bx +c. O programa deverá pedir os valores de a, b e c e fazer as 
 * consistências, informando ao usuário nas seguintes situações:
 * 		a) Se o usuário informar o valor de A igual a zero, a equação não é do
 * segundo grau, e o programa não deve pedir os demais valores, sendo encerrado.
 * 		b) Se o delta calculado for negativo, a equação não possui raízes reais. 
 * Informe ao usuário e encerre o programa.
 * 		c) Se o delta calculado for igual a zero a equação possui apenas uma raiz real.
 * Informe ao usuário;
 * 		d) Se o delta for positivo, a equação possui duas raízes reais. Informe ao usuário;
 * 
 ********************************************************************************************/

package condicionais;

import java.util.Scanner;

public class Ex02CalculaEquacaoSegundoGrau {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Valor de a: ");
		int a = scan.nextInt();
		
		scan.close();

		if(a == 0) {
			System.out.println("A equação não é de segundo grau.");
		} else {
			System.out.println("Valor de b: ");
			int b = scan.nextInt();

			System.out.println("Valor de c: ");
			int c = scan.nextInt();

			double delta = (b * b) - (4 * a * c);

			if(delta < 0) {
				System.out.println("Delta negativo. Encerra o programa"); //senao faz o calculo certo
			} else {

				System.out.println("Delta = " + delta);

				double x1 = ((-b) + Math.sqrt(delta) / (2*a)); //sqrt é raiz quadrada no java
				double x2 = ((-b) - Math.sqrt(delta) / (2*a));

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}	
		}
	}	
}


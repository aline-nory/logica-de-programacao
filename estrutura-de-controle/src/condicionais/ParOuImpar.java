/************************************************************************
 * Fa�a um programa que pe�a um n�mero inteiro  e determine se ele � par
 * ou impar. Dica: utilize o operador m�dulo (resto da divis�o)
 ************************************************************************/

package condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		scan.close();
		
		if(num % 2 == 0) {
			System.out.println("N�mero par.");
		} else {
			System.out.println("N�mero �mpar.");
		}
	}
}

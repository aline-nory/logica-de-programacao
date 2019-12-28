/**************************************************************************************
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso 
 * o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 **************************************************************************************/

package repeticao;

import java.util.Scanner;

public class NotaValida {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;
		double nota; 

		do {
			System.out.println("Entre com uma nota de 0 a 10:");
			nota = scan.nextDouble();
			if(nota >=0 && nota <=10) {
				notaValida = true;
				System.out.println("Nota válida." + nota);
			} else { 
				System.out.println("Nota inválida." + nota);
			}
		} while(!notaValida);
		
		scan.close();
	}
}

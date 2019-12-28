/**************************************************************************************
 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso 
 * o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
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
				System.out.println("Nota v�lida." + nota);
			} else { 
				System.out.println("Nota inv�lida." + nota);
			}
		} while(!notaValida);
		
		scan.close();
	}
}

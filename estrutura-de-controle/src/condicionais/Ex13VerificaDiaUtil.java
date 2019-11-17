/******************************************************************************
 * Faça um programa que leia um número de 1 a 7 e informe se o mesmo corresponde
 * a um dia da semana útil ou final de semana.
 ******************************************************************************/
package condicionais;

import java.util.Scanner;

public class Ex13VerificaDiaUtil {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número (1a7):");
		int diaDaSemana = scan.nextInt();		
		scan.close();
		
		switch(diaDaSemana) {
			case 2:
			case 3:
			case 4:
			case 5: 
			case 6: System.out.println("Dia útil."); break;
			case 1: //caso seja 1 ou 7:
			case 7: System.out.println("Final de semana."); break;
			default: System.out.println("Não é um dia da semana válido.");
		}	
	}	
}

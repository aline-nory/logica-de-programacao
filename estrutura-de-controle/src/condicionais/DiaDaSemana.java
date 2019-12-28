/******************************************************************************
 * Fa�a um programa que leia um n�mero e exiba o dia correspondente da semana,
 * (1 - Domingo, 2 - Segunda..) se digitar outro valor deve aparecer inv�lido.
 ******************************************************************************/

package condicionais;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um dia da semana: (1/7) ");
		int diaSemana = scan.nextInt();		
		scan.close();

		switch(diaSemana) {
		case 1: System.out.println("Hoje � domingo."); break;	
		case 2: System.out.println("Hoje � segunda."); break;	
		case 3: System.out.println("Hoje � ter�a."); break;	
		case 4: System.out.println("Hoje � quarta."); break;	
		case 5: System.out.println("Hoje � quinta."); break;	
		case 6: System.out.println("Hoje � sexta."); break;	
		case 7: System.out.println("Hoje � sabado."); break;	
		default: System.out.println("N�o � um dia da semana v�lido.");
		}
	}
}

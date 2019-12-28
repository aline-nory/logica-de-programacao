/******************************************************************************
 * Faça um programa que leia um número e exiba o dia correspondente da semana,
 * (1 - Domingo, 2 - Segunda..) se digitar outro valor deve aparecer inválido.
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
		case 1: System.out.println("Hoje é domingo."); break;	
		case 2: System.out.println("Hoje é segunda."); break;	
		case 3: System.out.println("Hoje é terça."); break;	
		case 4: System.out.println("Hoje é quarta."); break;	
		case 5: System.out.println("Hoje é quinta."); break;	
		case 6: System.out.println("Hoje é sexta."); break;	
		case 7: System.out.println("Hoje é sabado."); break;	
		default: System.out.println("Não é um dia da semana válido.");
		}
	}
}

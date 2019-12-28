/****************************************************************
 * Faça um programa que pergunte em que turno você estuda.
 * Peça para digitar: M - Matutino / V - Vespertino / N - Noturno.
 * Imprima a mensagem: "Bom dia" ,"Boa tarde", "Boa Noite" ou 
 * "Valor Inválido", conforme o caso.
 *****************************************************************/

package condicionais;

import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o turno (M/V/N):");
		String turno = scan.next();
		scan.close();
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		}	
	}
}

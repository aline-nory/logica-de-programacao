/*******************************************************
 * Faça um programa que verifique se uma letra digitada 
 * é uma vogal ou consoante.
 * 
 *******************************************************/

package condicionais;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra:");
		String letra = scan.next();
		scan.close();
		
		if( letra.length() > 1) {
			System.out.println("Não é uma letra válida.");
		} else {
			switch(letra) {
			case "a": 
			case "e": 
			case "i": 
			case "o":
			case "u": 
			case "A": 
			case "E": 
			case "I": 
			case "O":
			case "U": System.out.println("A letra digitada é uma vogal " + letra); break;
			default: System.out.println("A letra digitada é uma consoante " + letra); 
			}	
		}	
	}
}

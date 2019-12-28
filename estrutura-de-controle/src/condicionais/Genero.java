/***************************************************************
 * Faça um programa que verifique se a letra digitada é F ou M. 
 * Conforme a letra escrever: F - feminino, M - masculino, ou 
 * sexo inválido. 
 ***************************************************************/

package condicionais;

import java.util.Scanner;

public class Genero {
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra (F/M)");
		String input = scan.next();	
		scan.close();
		
		if (input.equalsIgnoreCase("F")) {
			System.out.println("F - Feminimo.");
		} else if(input.equalsIgnoreCase("M")){
			System.out.println("M - Masculino.");
		} else {
			System.out.println("Sexo inválido");
		}
	}
}

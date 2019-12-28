/*************************************************************************************
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
 * são:
 * 		1) Telefonou para a vitima?
 * 		2) Esteve no local do crime?
 * 		3) Mora perto da vítima?
 * 		4) Devia para a vitima?
 * 		5) Já trabalhou com a vitima?
 * 
 * O programa deve no final emitir uma classificação sobre a participação da pessoa no
 * crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada 
 * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário,
 * ela será classificada como "Inocente".
 *************************************************************************************/

package condicionais;

import java.util.Scanner;

public class TipoDeCrime {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda as perguntas:\n");
		
		System.out.println("1) Telefonou para a vitima?(S/N)");
		String resp1 = scan.next();
		
		System.out.println("2) Esteve no local do crime?(S/N)");
		String resp2 = scan.next();
		
		System.out.println("3) Mora perto da vítima?(S/N)");
		String resp3 = scan.next();
		
		System.out.println("4) Devia para a vitima?(S/N)");
		String resp4 = scan.next();
		
		System.out.println("5) Já trabalhou com a vitima?(S/N)");
		String resp5 = scan.next();
		
		scan.close();
		
		int cont = 0;
		
		if(resp1.equalsIgnoreCase("s")){
			cont++;
		} 		
		if(resp2.equalsIgnoreCase("s")){
			cont++;
		}		
		if(resp3.equalsIgnoreCase("s")){
			cont++;
		}
		if(resp4.equalsIgnoreCase("s")){
			cont++;
		}		
		if(resp5.equalsIgnoreCase("s")){
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita.");
		} else if(cont == 3 || cont == 4) {
			System.out.println("Cúmplice.");
		} else if(cont == 5){
			System.out.println("Assassino.");
		} else if (cont == 0 || cont == 1){
			System.out.println("Inocente.");
		}
	}
}

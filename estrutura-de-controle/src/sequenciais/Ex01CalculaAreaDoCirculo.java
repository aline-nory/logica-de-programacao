/***********************************************************************************
 * Faça um programa que peça o raio de um círculo, calcule e mostre o seu resultado;
 * 
 ***********************************************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex01CalculaAreaDoCirculo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o raio do círculo:");
	double raio = scan.nextDouble();
	scan.close();
	
	double area = Math.PI * Math.pow(raio, 2);
	
	System.out.println("A área do círculo é aproximadamente " + area);
	
	}
}
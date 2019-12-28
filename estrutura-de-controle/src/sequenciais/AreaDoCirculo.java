/***********************************************************************************
 * Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre o seu resultado;
 * 
 ***********************************************************************************/

package sequenciais;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o raio do c�rculo:");
	double raio = scan.nextDouble();
	scan.close();
	
	double area = Math.PI * Math.pow(raio, 2);
	
	System.out.println("A �rea do c�rculo � aproximadamente " + area);
	
	}
}
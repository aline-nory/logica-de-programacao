/********************************************************
 * Fa�a um Programa que converta metros para cent�metros.
 * 
 ********************************************************/

package sequenciais;

import java.util.Scanner;

public class Ex03Convers�oDeMetroParaCentimetro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		scan.close();

		double cm = metros * 100; //1 m = 100 cm

		System.out.println(metros + " m � igual a " + cm + " cm");

	}

}

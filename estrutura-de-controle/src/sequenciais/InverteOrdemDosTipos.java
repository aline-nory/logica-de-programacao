/*********************************************************************
 * Faça um programa que peça um int, um double e uma String e inverta 
 * a ordem para String, double, int.
 * 
 *********************************************************************/

package sequenciais;
import java.util.Scanner;

public class Ex05InverteOrdemDosTipos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int i = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Entre com um número real");
		double d = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Entre com uma letra");
		String s = scan.nextLine(); 
		
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}

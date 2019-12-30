
package arrays;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int total =0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número: ");
			vetorA[i] = scan.nextInt();
			
			total += vetorA[i];
		}
		System.out.println("Total: " + total);
		scan.close();
	}
}

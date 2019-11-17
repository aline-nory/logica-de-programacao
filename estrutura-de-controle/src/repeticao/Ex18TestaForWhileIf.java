package repeticao;

import java.util.Scanner;

public class Ex18TestaForWhileIf {
	public static void main (String[] args) {
		System.out.println("Digite um numero"); 
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();

		for(int i=0; i<x; i++) {
			while(x>1) {
				if(x % 2 == 0) { 
					x = x / 2;
				}else {
					x = 3 * x + 1;
				}
				System.out.println("Sequência de números: " + x); 
			}	
		}
	}
}

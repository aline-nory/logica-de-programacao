package arrays;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		boolean par = false;
		
		do {
			for(int i=0; i<vetorA.length; i++) {
				vetorA[i] = (int)(Math.round(Math.random() * 10));
				if(vetorA[i] % 2 == 0) {
					par = true;
					System.out.println(vetorA[i]);
				} 
			}
		} while(!par);
		
		scan.close();
	}
}

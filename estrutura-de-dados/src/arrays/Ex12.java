package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int igual15 = 0;
		int qdtMaior15 = 0;
	
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um n�mero:");
			vetorA[i] = scan.nextInt();	
			
			if(vetorA[i] == 15) { //b
				igual15++;
			} else if(vetorA[i] < 15) { //a
				somaMenor15 += vetorA[i];
			} else {
				somaMaior15 += vetorA[i];
				qdtMaior15++;
			}
		} 
	
		System.out.println();
		System.out.println("Quantidade n�meros == 15: " + igual15);
		System.out.println("Soma n�meros < 15: " + somaMenor15);
		System.out.println("M�dia n�meros > 15: " + (somaMaior15/qdtMaior15));
	}
}

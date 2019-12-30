package arrays;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int igual15 = 0;
		double somaMenor15 = 0;
		double somaMaior15 = 0;
		int qdtMaior15 = 0;
	
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um número:");
			vetorA[i] = scan.nextInt();	
			
			if(vetorA[i] == 15) { 
				igual15++;
			} else if(vetorA[i] > 15) { 
				somaMaior15 += vetorA[i];
				qdtMaior15++;
			} else {
				somaMenor15 += vetorA[i];
			}
		} 

		System.out.println();
		System.out.println("Quantidade números igual a 15: " + igual15);
		System.out.println("Soma dos números menor que 15: " + somaMenor15);
		System.out.println("Média dos números maior que 15: " + (somaMaior15/qdtMaior15));
		scan.close();
	}
}

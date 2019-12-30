package arrays;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int maior35Anos = 0;

		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade");
			vetorA[i] = scan.nextInt();

			if(vetorA[i] > 35) {
				maior35Anos++;
			}
		}
		scan.close();
		System.out.println("A quantidade de pessoas "
				+ "> 35 anos = " + maior35Anos);
	}
}

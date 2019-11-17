package arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length]; //No caso de divisão
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com a posição de A: " + i);
			vetorA[i] = scan.nextInt();		
		}
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com a posição de B: " + i);
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length;i++) {
			//vetorC[i] = vetorA[i] + vetorB[i];
			//vetorC[i] = vetorA[i] - vetorB[i];
			//vetorC[i] = vetorA[i] * vetorB[i];
			vetorC[i] = vetorA[i] / vetorB[i];
		}
			
		System.out.println("vetor A:");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##"); //No caso de divisao
		
		System.out.println("vetor C:");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}
}



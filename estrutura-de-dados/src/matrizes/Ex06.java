package matrizes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] matrizM = new int[3][3];

		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM[i].length; j++) {

				System.out.println("Entre com o valor da pos [" + i + "," + j + "]:");
				matrizM[i][j] = scan.nextInt();
			}
		}

		System.out.println();

		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " - ");
			}
			System.out.println();
		}

		System.out.println();

		int qtdPares = 0;
		int qtdImpares = 0;
		for(int i=0; i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				if(matrizM[i][j] % 2 ==0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}	
		}

		System.out.println("Pares: " + qtdPares);
		System.out.println("Impares: " + qtdImpares);
	}
}

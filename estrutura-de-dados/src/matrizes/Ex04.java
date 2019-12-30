package matrizes;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random numeroRandom = new Random();

		int[][] matrizM = new int[4][4];

		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				matrizM[i][j] = numeroRandom.nextInt(100);
			}
		}

		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " - ");
			}
			System.out.println();
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i=0; i<matrizM.length; i++) {
			for(int j=0; j<matrizM[i].length; j++) {
				if(matrizM[i][j] > maior) {
					maior = matrizM[i][j];
					linha = i;
					col = j;
				}
			}
		}

		System.out.println();
		System.out.println("Maior número: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
	}
}

